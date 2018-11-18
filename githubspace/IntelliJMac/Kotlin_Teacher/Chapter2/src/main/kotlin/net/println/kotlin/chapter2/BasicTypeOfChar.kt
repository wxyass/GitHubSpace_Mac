package net.println.kotlin.chapter2

/**
 * Created by benny on 2/26/17.
 */
val aChar: Char = '0'
val bChar: Char = '中'
val cChar: Char = '\u000f'      // Unicode编码,表示一个空格

fun main(args: Array<String>) {
    println(aChar)              // 0
    println(bChar)              // 中
    println(cChar)
}
