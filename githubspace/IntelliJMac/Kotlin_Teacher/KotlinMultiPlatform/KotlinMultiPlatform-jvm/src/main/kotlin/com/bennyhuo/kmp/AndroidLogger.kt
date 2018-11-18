package com.bennyhuo.kmp

import android.util.Log

private const val TAG = "ANDROID"

class AndroidLogger: ILogger{
    override fun debug(log: Any?) {
        Log.d(TAG, log.toString())
    }

    override fun error(log: Any?) {
        Log.e(TAG, log.toString())
    }

}