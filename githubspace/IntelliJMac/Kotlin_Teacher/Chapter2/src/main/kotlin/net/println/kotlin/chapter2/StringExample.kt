package net.println.kotlin.chapter2

/**
 * Created by benny on 2/26/17.
 */
val string: String = "HelloWorld"
val fromChars: String = String(charArrayOf('H', 'e','l','l','o','W','o','r','l','d'))

fun main(args: Array<String>) {
    println(string == fromChars)                                // true 其中的==类似java中的equal
    println(string === fromChars)                               // false 其中的===类似java的==

    println("接下来我们要输出:" + string)                         // HelloWorld

    val arg1: Int = 0
    val arg2: Int = 1
    println("" + arg1 + " + " + arg2 + " = " + (arg1 + arg2))  // 0 + 1 = 1
    println("$arg1 + $arg2 = ${arg1 + arg2}")                  // 0 + 1 = 1  字符串模板

    //Hello "Trump"
    val sayHello : String = "Hello \"Trump\""                   // Hello "Trump"  打印双引号 用到转义字符
    println(sayHello)
    //salary
    val salary: Int = 1000
    //$salary
    println("\$salary")                                         // $salary  打印$ 用到转义字符

    val rawString: String = """
        \t
        \n
\\\\\\$$$ salary
    """
    println(rawString)                                          // 用三个双引号  打印的是里面的原始字符 注意$后要加空格
    println(rawString.length)
}