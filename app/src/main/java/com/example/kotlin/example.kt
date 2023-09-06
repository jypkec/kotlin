package com.example.kotlin

fun main(){
    var name:String ="상아"
    var number : Int =10
    //number = null
    var nickname: String?=null
    var secondNumber: Int?=null

    val result=if(nickname==null){
        "값이 없음"
    }else{
        nickname
    }
    nickname=null
    val result2=nickname?:"null answer"
    val size = nickname?.length

    println(size)

    println(result2)
}