package org.elixir_lang.utils

import com.intellij.execution.wsl.WSLDistribution
import com.intellij.execution.wsl.WSLUtil

fun String.getDistroFromPath(): WSLDistribution? {
    if (!WSLUtil.hasAvailableDistributions()) {
        return null
    }

    val regex = Regex("\\\\\\\\wsl\\$\\\\([a-zA-Z0-9-.]*)(.*)")
    val match = regex.matchEntire(this)
//    val distros = WSLUtil.getAvailableDistributions()
    if (match != null) {
        return getDistributionByMsId(match.groups[1]?.value)
    }
    return null

}

fun String.getLinuxPathFromWslWindowsMountedPath(): String? {
    if (!WSLUtil.hasAvailableDistributions()) {
        return null
    }

    val regex = Regex("\\\\\\\\wsl\\$\\\\([a-zA-Z0-9-.]*)(.*)")
    val match = regex.matchEntire(this.replace('/', '\\'))
    if (match != null) {
        return match.groups[2]?.value?.replace('\\', '/')
    }else{
        val winPathRegex = Regex("^([A-Z]):\\\\(.*)\$")
        val winMatch = winPathRegex.matchEntire(this.replace('/', '\\'))
        winMatch?.groups?.get(2)?.value?.replace('\\', '/')?.let {
            return "/mnt/c/$it"
        }
    }
    return null

}

fun getDistributionByMsId(id: String?): WSLDistribution? {
    if (id == null) {
        return null
    }
    for (distribution in WSLUtil.getAvailableDistributions()) {
        if (id == distribution.msId) {
            return distribution
        }
    }
    return null
}



