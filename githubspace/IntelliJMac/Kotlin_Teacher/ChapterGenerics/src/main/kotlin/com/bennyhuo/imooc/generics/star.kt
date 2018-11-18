package com.bennyhuo.imooc.generics

fun main(args: Array<String>) {
    val list: List<*> = listOf(1,2)

    val comparable: Comparable<*> = object : Comparable<Any>{
        override fun compareTo(other: Any): Int {
            return 0
        }
    }

    Raw.getRaw()
}



fun <T> hello(){

}

open class Hello<T>{

}

class Hello2<T>

class SonOfHello: Hello<Hello2<*>>()