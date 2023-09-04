package com.example.kotlin

fun main(){
    var result =test(c=5, a=1)//변수 명시 가능
    print(result)
    println(time(1,5))
    println(times(12,5))
}
//Default overrloading 절약
fun test(a : Int, b: Int=3,c: Int = 4) :Int{
    println("test")
    return a+b
}

fun times(a: Int, b:Int): Int{
    return a*b
}
fun time(a:Int,b:Int) = a*b
