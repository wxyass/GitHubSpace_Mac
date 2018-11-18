package net.println.kotlin.chapter2

import net.println.kotlin.chapter2.helloworld.HelloWorld

/**
 * Created by benny on 2/26/17.
 */
val FINAL_HELLO_WORLD: String = "Hello World"
var helloWorld: String = FINAL_HELLO_WORLD
var nullableHelloWorld: String? = helloWorld
val helloWorldArray: Array<Char> = arrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd')
val helloWorldCharArray: CharArray = charArrayOf('H', 'e', 'l', 'l', 'o', 'W', 'o', 'r', 'l', 'd')
val helloWorldLength: Int = helloWorld.length
val helloWorldLengthLong: Long = helloWorldLength.toLong()

fun main(args: Array<String>) {
    // final hello world: Hello World
    println("final hello world: " + FINAL_HELLO_WORLD)
    // assignable hello world: Hello World
    println("assignable hello world: " + helloWorld)
    // hello world from nullable type: Hello World
    println("hello world from nullable type: " + nullableHelloWorld)
    // hello world from Array: HelloWorld
    println("hello world from Array: " + helloWorldArray.joinToString(""))
    // hello world from CharArray: HelloWorld
    println("hello world from CharArray: " + String(helloWorldCharArray))
    // class name hello world: HelloWorld
    println("class name hello world: " + HelloWorld::class.java.simpleName)
    // class name hello world: net.println.kotlin.chapter2.helloworld.HelloWorld
    println("class name hello world: " + HelloWorld::class.java.name)
    // java.lang.StringIndexOutOfBoundsException: String index out of range: 11
    println("part of the class name of HelloWorld: "
            + HelloWorld::class.java.simpleName.slice(0 until helloWorldLength)) // [0, 11)
    // the length of hello world is : 11
    println("the length of hello world is : " + helloWorldLength)
    // the length of hello world is (long): 11
    println("the length of hello world is (long): " + helloWorldLengthLong)
}
