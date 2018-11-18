package com.bennyhuo.imooc.reflections

import kotlin.reflect.KMutableProperty
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties
import kotlin.reflect.full.primaryConstructor

fun main(args: Array<String>) {
    val bennyKt = cost("Kotlin 构造对象") {
        Person::class.primaryConstructor!!.call("benny", 21)
    }

    val bennyJava = cost("Java 构造对象") {
        Person::class.java.getDeclaredConstructor(String::class.java, Int::class.java).newInstance("benny", 20)
    }

    cost("Kotlin 访问属性") {
        Person::class.memberProperties.firstOrNull { it.name == "age" }?.get(bennyKt)
    }

    cost("Java 访问属性") {
        Person::class.java.getDeclaredField("age").apply { isAccessible = true }.get(bennyJava)
    }

    cost("Kotlin 修改属性") {
        (Person::class.memberProperties.firstOrNull { it.name == "age" } as? KMutableProperty<Int>)?.setter?.call(bennyKt, 21)
    }

    cost("Java 修改属性") {
        Person::class.java.getDeclaredField("age").apply { isAccessible = true }.set(bennyJava, 21)
    }

    cost("Kotlin 访问方法") {
        Person::class.memberFunctions.firstOrNull { it.name == "toString" }?.call(bennyKt)
    }

    cost("Java 访问方法") {
        Person::class.java.getMethod("toString").invoke(bennyJava)
    }
}

inline fun <T> cost(tag: String = "", crossinline block: () -> T): T {
    val start = System.nanoTime()
    val t = block()
    println(tag + ": " + (System.nanoTime() - start))
    return t
}
