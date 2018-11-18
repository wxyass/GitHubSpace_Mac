package com.bennyhuo.kmp

import platform.android.*

actual class Logger {
    actual fun debug(log: Any?) {
        __android_log_write(ANDROID_LOG_INFO, "Konan", log.toString())
    }
    actual fun error(log: Any?) {
        __android_log_write(ANDROID_LOG_ERROR, "Konan", log.toString())
    }
}