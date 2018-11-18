package com.bennyhuo.kmp

class JvmLogger: ILogger{
    override fun debug(log: Any?) {
        println(log)
    }

    override fun error(log: Any?) {
        System.err.println(log)
    }

}