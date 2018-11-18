package com.bennyhuo.imooc.generics

import java.math.BigDecimal

fun main(args: Array<String>) {

    val a = 2
    val b = 3
    val c = maxOf(a,b)
    println(c)

    val complex3 = Complex1(3.0, 4.0)
    val complex4 = Complex1(3.0, 5.0)
    println(complex3)
    println(complex4)

    val complex = Complex(3.0, 4.0)
    val complex2 = Complex(3, 5)
    println(complex)
    println(complex2)
}

data class Complex1(val a: Double, val b: Double):Comparable<Complex1>{

    override fun compareTo(other: Complex1): Int {
        return (value() - other.value()).toInt()
    }

    fun value():Double{
        return a*a + b*b
    }

    override fun toString(): String {
        return "($a + $b i)"
    }
}

data class Complex<T: Number>(val a: T, val b: T){

    override fun toString(): String {
        return "($a + $b i)"
    }
}

// 泛型
fun <T: Comparable<T>> maxOf(a: T, b: T): T{
    return if( a < b) b else a
}