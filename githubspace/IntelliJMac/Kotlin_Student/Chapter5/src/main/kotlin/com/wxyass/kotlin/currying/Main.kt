package com.wxyass.kotlin.currying

import com.sun.org.apache.xpath.internal.operations.Bool
import java.io.OutputStream
import java.nio.charset.Charset

/**
 * Created by benny on 4/15/17.
 */
fun hello(x:String ,y:Int,z:Double):Boolean{
    return true
}

// fun curriedHello(x:String):(y:Int)->(z:Double)->Boolean{}

// 普通函数
fun log(tag: String, target: OutputStream, message: Any?){
    target.write("[$tag] $message\n".toByteArray())
}

// 柯里化
fun log1(tag: String)
    = fun(target: OutputStream)
    = fun(message: Any?)
    = target.write("[$tag] $message\n".toByteArray())

fun main(args: Array<String>) {
    // 常规
    log("benny", System.out, "HelloWorld")

    // 柯里化
    log1("benny")(System.out)("HelloWorld1")

    // 柯里化
    ::log.curried()("benny")(System.out)("HelloWorld2")

    // 偏函数
    val consoleLogWithTag = (::log.curried())("benny")(System.out)
    consoleLogWithTag("HelloWorld3")
    consoleLogWithTag("HelloWorld4")
    consoleLogWithTag("HelloWorld5")
    consoleLogWithTag("HelloWorld6")

    val bytes = "我是中国人".toByteArray(charset("GBK"))
    val stringFromGBK = makeStringFromGbkBytes(bytes)
    println(stringFromGBK)
}

// 扩展方法  柯里化
fun <P1, P2, P3, R> Function3<P1, P2, P3, R>.curried()
    = fun(p1: P1) = fun(p2: P2) = fun(p3: P3) = this(p1, p2, p3)

val makeString = fun(byteArray: ByteArray, charset: Charset): String{
    return String(byteArray, charset)
}

// 偏函数
val makeStringFromGbkBytes = makeString.partial2(charset("GBK"))

fun <P1, P2, R> Function2<P1, P2, R>.partial2(p2: P2) = fun(p1: P1) = this(p1, p2)
fun <P1, P2, R> Function2<P1, P2, R>.partial1(p1: P1) = fun(p2: P2) = this(p1, p2)