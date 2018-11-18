package com.bennyhuo.kmp

actual class Logger {
    actual fun debug(log: Any?) {
        console.log(log)
    }
    actual fun error(log: Any?) {
        console.error(log)
    }

}