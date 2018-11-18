package com.bennyhuo.kmp

import platform.posix.*

actual class Logger {
    actual fun debug(log: Any?) {
        println(log)
    }
    actual fun error(log: Any?) {
        fprintf(__stderrp, "$log\n")
    }
}