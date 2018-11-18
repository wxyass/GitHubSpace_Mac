package com.bennyhuo.imooc.reflections

import java.util.concurrent.Callable
import kotlin.reflect.KClass
import kotlin.reflect.KMutableProperty1
import kotlin.reflect.full.memberExtensionFunctions
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties
import kotlin.reflect.full.primaryConstructor

@PoKo
open class Person(@AnotherAnno val name: String, var age: Int){
    fun hello(){
        println("Hello")
    }

    fun hello2(){
        println("Hello2")
    }

    fun String.times(other: Int){

    }
}

class Engineer(name: String, age: Int): Person(name, age)

class NoPrimaryContructor{
    constructor(){
        println("not primary, no arg")
    }

    constructor(int: Int){
        println("not primary, arg: $int")
    }
}

class DefaultConstructor()

fun Person.sayHello(){
    println("Hello")
}

fun sayHello(){
    println("Hello")
}

fun main(args: Array<String>) {
    val clazz = Person::class.java
    val kclazz = Person::class // KClass
    val person: Person = Person("benny", 18)
    val kClazz2 = person::class
    val kClazz3 = person.javaClass.kotlin
    val clazz2 = person.javaClass
    val clazz3 = person::class.java

    val defaultConstructor = DefaultConstructor::class.java.newInstance()
    val primaryConstructor = kClazz2.primaryConstructor!!
    val kPerson = primaryConstructor.call("benny", 18)
    println("kperson: $kPerson")

    NoPrimaryContructor::class.constructors.last().call(0)

    (kclazz.memberProperties.first { it.name == "age" } as? KMutableProperty1<Person, Int>)?.set(kPerson, 21)
    println(kPerson)

    kclazz.memberFunctions.forEach{
        println(it)
    }

    println("扩展方法")
    kclazz.memberExtensionFunctions.forEach(::println)
    println("扩展方法 -- ")
    kclazz.annotations.forEach(::println)
    kclazz.memberProperties.first { it.name == "name" }.annotations.forEach(::println)

    val person2 = clazz2.getConstructor(String::class.java, Int::class.java).newInstance("benny", 18)
    //clazz2.getDeclaredField("name").apply { isAccessible = true }.set(person2, "Andy")
    //val name2 = clazz2.getDeclaredMethod("getName").invoke(person2)
//    val person3 = clazz2.getDeclaredMethod("copy", String::class.java, Int::class.java).invoke(person2, person2.name, person2.age)
    println(person2)

    Class.forName("com.bennyhuo.imooc.reflections.JavaReflectionsKt")
            .getDeclaredMethod("sayHello")
            .invoke(null)

    clazz.getAnnotation(PoKo::class.java).let(::println)
    clazz.getDeclaredField("name").apply { isAccessible = true }.annotations.forEach {
        println(it)
    }

}