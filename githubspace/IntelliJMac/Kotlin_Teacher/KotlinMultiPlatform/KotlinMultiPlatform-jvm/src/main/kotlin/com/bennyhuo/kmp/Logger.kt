package com.bennyhuo.kmp

actual class Logger {

    private val logger: ILogger by lazy {
        try {
            Class.forName("android.os.Build")
            AndroidLogger()
        }catch (e: Exception){
            JvmLogger()
        }
    }

    actual fun debug(log: Any?) {
        logger.debug(log)
    }
    actual fun error(log: Any?) {
        logger.error(log)
    }

}

interface ILogger{
    fun debug(log: Any?)
    fun error(log: Any?)
}