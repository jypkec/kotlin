package com.example.kotlin

fun main(){
    //1..10== IntRange(1,10)
    for(i in 1..10 step(2)){
        println(i)
        print(".")
    }
    for(i in 1 until 10){
        println(i)
        print(".")
    }
    for(i in 10 downTo 1){
        println(i)
        print(".")
    }
    var c = 1
    while (c<11){
        println(c)
        print(".")
        c++
    }
}