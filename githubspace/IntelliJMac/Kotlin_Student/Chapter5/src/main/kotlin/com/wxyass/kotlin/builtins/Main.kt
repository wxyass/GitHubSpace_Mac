package com.wxyass.kotlin.builtins

import java.io.BufferedReader
import java.io.FileReader

/**
 * Created by benny on 4/15/17.
 */

data class Person(val name: String, val age: Int){
    fun work(){
        println("$name is working!!!")
    }
}

fun main(args: Array<String>) {

    /*// 一个整型集合
    val list = listOf(1,3,5,10,8,2)

    // 使用forEach组建新的集合
    val newList = ArrayList<Int>()
    list.forEach {
        val newElement = it * 2 + 3
        newList.add(newElement)
    }
    newList.forEach(::println)

    // 使用map组建新的集合
    val newList2 = list.map {
        it * 2 + 3
    }
    newList2.forEach(::println)
    list.map(::println)

    // 使用map组建另一类型的集合
    val newList3 = list.map {
        it.toDouble()
    }
    newList3.forEach(::println)

    // 与newList3一样
    val  newList4= list.map (Int :: toDouble)
    newList4.forEach(::println)

    // 一个整型集合的集合
    val list2 = listOf(
            1..20,
            2..5,
            100..322
    )

    // 使用flatMap组建新的集合
    val flatList = list2.flatMap {
        it
    }
    flatList.forEach(::println)

    // 使用flatMap组建新的集合
    val flatList2 = list2.flatMap {
        it.map {
            "No.$it"
        }
    }
    flatList2.forEach(::println)

    // 同flatList2  使用flatMap组建新的集合
    val flatList3 = list2.flatMap { intRange ->
        intRange.map { intElement ->
            "No.$intElement"
        }
    }
    flatList3.forEach(::println)

    // 求和
    val sum = flatList.reduce { acc, i -> acc + i }
    println(sum) // 47277

    // 0到6的阶乘
    (0..6).map(::factorial).forEach(::println)
    // 1        0   (1)=1
    // 1        1   (1*1)=1
    // 2        2   (1*2)=2
    // 6        3   (2*3)=6
    // 24       4   (6*4)=24
    // 120      5   (24*5)=120
    // 720      6   (120*6)=720

    // 阶乘后求和
    val sum2 = (0..6).map(::factorial).reduce { acc, i -> acc + i }
    println(sum2) // 874

    // 使用fold设定一个初始值 再相加
    val sum3 = (0..6).map(::factorial).fold(5) { acc, i -> acc + i }
    println(sum3) // 879

    // 使用fold拼接字符串
    val string = (0..6).map(::factorial).fold(StringBuffer()) {
        acc, i -> acc.append(i).append(",")
    }
    println(string) // 1,1,2,6,24,120,720,

    // 拼接字符串
    val string2 = (0..6).joinToString(",")
    println(string2) // 0,1,2,3,4,5,6


    // 使用foldRight 倒序拼接字符串 注意参数调换位置
    val string3 = (0..6).map(::factorial).foldRight(StringBuffer()) {
        i,acc  -> acc.append(i).append(",")
    }
    println(string3) // 720,120,24,6,2,1,1,


    //使用filter过滤,将阶乘中的奇数保留
    println((0..6).map(::factorial).filter { it % 2== 1 })
    // [1, 1]

    // 使用filterIndexed过滤,将阶乘中的奇数位置上的数保留
    println((0..6).map(::factorial).filterIndexed { index, i ->  index % 2== 1} )
    // [1, 6, 120]

    // takeWhile 只要遇到一个不符合条件的,不在向后取了,只取前面符合条件的
    // (比如:取奇数,只要遇到偶数就停止)
    println((0..6).map(::factorial).takeWhile { it % 2 == 1} )
    // [1, 1]*/


    // let
    findPerson()?.let {persion->
        println(persion.name)
        println(persion.age)
    }

    // let
    findPerson()?.let {(name,age)->
        println(name)
        println(age)
    }

    // apply 直接调用方法 属性
    findPerson()?.apply {
        work()
        println(age)
    }

    // with 参数不是空
    val br = BufferedReader(FileReader("Hello.txt"))
    with(br){
        var line: String?
        while (true){
            line = readLine()?: break
            println(line)
        }
        close()
    }

    // use
    BufferedReader(FileReader("hello.txt")).use {
        var line: String?
        while (true){
            line = it.readLine()?: break
            println(line)
        }
    }

}

fun findPerson(): Person?{
    return null
}

fun factorial(n:Int): Int{
    if(n==0)return 1
    return (1..n).reduce { acc, i -> acc*i }
}