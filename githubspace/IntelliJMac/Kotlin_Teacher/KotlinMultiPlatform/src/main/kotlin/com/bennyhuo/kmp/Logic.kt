package com.bennyhuo.kmp

val logger = Logger()

fun doSomething(): String{
    logger.debug("开始计算")
    logger.error("出错啦！")
    logger.debug("完事儿啦")
    return "HelloWorld"
}