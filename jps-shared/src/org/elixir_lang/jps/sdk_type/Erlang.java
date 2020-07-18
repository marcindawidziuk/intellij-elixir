package org.elixir_lang.jps.sdk_type;

import com.intellij.openapi.util.SystemInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jps.model.JpsDummyElement;
import org.jetbrains.jps.model.JpsElementFactory;
import org.jetbrains.jps.model.JpsElementTypeWithDefaultProperties;
import org.jetbrains.jps.model.library.sdk.JpsSdkType;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.AccessDeniedException;

import static org.elixir_lang.jps.SdkType.exeFileToExePath;

public class Erlang extends JpsSdkType<JpsDummyElement> implements JpsElementTypeWithDefaultProperties<JpsDummyElement> {
    private static final String BYTECODE_INTERPRETER = "erl";
    public static final Erlang INSTANCE = new Erlang();

    @NotNull
    public static File getByteCodeInterpreterExecutable(@NotNull String sdkHome) {
        return getSdkExecutable(sdkHome, BYTECODE_INTERPRETER);
    }

    @NotNull
    private static File getSdkExecutable(@NotNull String sdkHome, @NotNull String command) {
        return new File(new File(sdkHome, "bin"), getExecutableFileName(command));
    }

    @NotNull
    public static String getExecutableFileName(@NotNull String executableName) {
        return executableName;
//        return SystemInfo.isWindows ? executableName + ".exe" : executableName;
    }

    @NotNull
    @Override
    public JpsDummyElement createDefaultProperties() {
        return JpsElementFactory.getInstance().createDummyElement();
    }

    @NotNull
    public static String homePathToErlExePath(@NotNull String erlangHomePath) throws FileNotFoundException, AccessDeniedException {
        File erlFile = getByteCodeInterpreterExecutable(erlangHomePath);
        return exeFileToExePath(erlFile);
    }
}
