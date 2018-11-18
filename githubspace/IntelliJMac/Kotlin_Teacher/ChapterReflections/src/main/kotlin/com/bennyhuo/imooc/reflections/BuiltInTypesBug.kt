package com.bennyhuo.imooc.reflections

fun main(args: Array<String>) {
//    String::class.members.forEach(::println)
//    Map::class.members.forEach(::println)
//    List::class.members.forEach(::println)
//    A::class.members.forEach(::println)
    AB::class.members.forEach(::println)
}

enum class A{
    ABC, DEF, GHI
}

class AB{
    val length: Int = 0
}