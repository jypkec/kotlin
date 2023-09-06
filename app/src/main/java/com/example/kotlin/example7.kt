package com.example.kotlin

fun main(){
    val list= mutableListOf(1,2,3,4,5);//가변
    list.add(6)
    list.addAll(listOf(7,8,9))
    val list2 = listOf(1,2,3,4,5)
    println(list.joinToString (","))

    list.map{it *10}
    val map=  mapOf((1 to "안녕"),(2 to "hello"))
    val map1= mutableMapOf((1 to "안녕"),(2 to "hello"))

    //collection 기본적으로 inmutable임임
}