package org.elixir_lang

import com.intellij.execution.configurations.GeneralCommandLine
import com.intellij.openapi.projectRoots.Sdk
import com.intellij.openapi.roots.OrderRootType
import org.elixir_lang.jps.sdk_type.Erlang
import org.elixir_lang.utils.getLinuxPathFromWslWindowsMountedPath
import java.io.FileNotFoundException

object Erl {
    /**
     * Keep in-sync with [org.elixir_lang.jps.Builder.erlCommandLine]
     */
    fun commandLine(pty: Boolean, environment: Map<String, String>, workingDirectory: String?, erlangSdk: Sdk):
            GeneralCommandLine {
        //TODO: Wsl?
        val commandLine = commandLine(pty, environment, workingDirectory)
        setErl(commandLine, erlangSdk)

        return commandLine
    }

    fun prependCodePaths(generalCommandLine: GeneralCommandLine, ebinDirectories: kotlin.collections.List<String>) {
        ebinDirectories.forEach { generalCommandLine.addParameters("-pa", it.getLinuxPathFromWslWindowsMountedPath()) }
    }

    /**
     * Keep in-sync with [org.elixir_lang.jps.Builder.sdkPropertiesToErlExePath]
     */
    private fun exePath(erlangSdk: Sdk): String =
            erlangSdk.homePath?.let {
//                if wsl
                "wsl"
//                Erlang.homePathToErlExePath(it)
            } ?: throw FileNotFoundException("Erlang SDK home path is not set")

    /**
     * Keep in-sync with [org.elixir_lang.jps.Builder.prependCodePaths]
     */
    private fun prependCodePaths(generalCommandLine: GeneralCommandLine, sdk: Sdk) {
        prependCodePaths(
                generalCommandLine,
                ebinDirectories(sdk)
        )
    }

    private fun ebinDirectories(sdk: Sdk): kotlin.collections.List<String> {
        var ebinDirectories: kotlin.collections.List<String>?

        do {
            ebinDirectories = try {
                sdk.rootProvider.getFiles(OrderRootType.CLASSES).map { it.canonicalPath!! }
            } catch (e: AssertionError) {
                null
            }
        } while (ebinDirectories == null)

        return ebinDirectories
    }

    /**
     * Keep in-sync with [org.elixir_lang.jps.Builder.setErl]
     */
    private fun setErl(commandLine: GeneralCommandLine, erlangSdk: Sdk) {
        commandLine.exePath = exePath(erlangSdk)
        erlangSdk.homePath?.let {
            val param = Erlang.homePathToErlExePath(it)?.getLinuxPathFromWslWindowsMountedPath()?.let{
                commandLine.addParameter(it);
            };
        }
        prependCodePaths(commandLine, erlangSdk)
    }
}
