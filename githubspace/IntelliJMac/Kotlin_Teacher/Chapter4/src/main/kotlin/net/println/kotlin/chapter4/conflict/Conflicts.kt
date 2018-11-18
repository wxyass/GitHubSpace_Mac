package net.println.kotlin.chapter4.conflict

/**
 * Created by benny on 4/3/17.
 */
abstract class A{
    open fun x(): Int = 5
}

interface B{
    fun x(): Int = 1
}

interface C{
    fun x(): Int = 0
}

class D(var y: Int = 0): A(), B, C{

    override fun x(): Int {
        println("call x(): Int in D")
        if(y > 0){
            return y
        }else if(y < -200){
            return super<C>.x()
        }else if(y < -100){
            return super<B>.x()
        }else{
            return super<A>.x()
        }
    }
}

fun main(args: Array<String>) {
    println(D(3).x())
    println(D(-10).x())
    println(D(-110).x())
    println(D(-10000).x())
}