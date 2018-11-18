package com.bennyhuo.imooc.generics

import com.google.gson.Gson
import java.io.File

fun main(args: Array<String>) {
    val person = Person("benny", 18)
    Gson().toJson(person).let{
        File("person.json").writeText(it)
    }

    needAPerson(Gson().fromJson(File("person.json").readText()))
}

fun needAPerson(person: Person){

}

inline fun <reified T> testGenerics(){
    println(T::class.java)
}

data class Person(val name: String, val age: Int)

inline fun <reified T> Gson.fromJson(json: String): T = fromJson(json, T::class.java)