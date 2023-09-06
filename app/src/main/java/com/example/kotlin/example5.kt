package com.example.kotlin

import java.time.DayOfWeek

fun main(){
    max(10,3)
}
fun max(a:Int,b:Int){
    //자바
    if(a>b){
        println(a)
    }
    else{
        println(b)
    }
    //코오틀린
    var result=if(a>b){
        a
    }
    else{
        b
    }
    result = if(a>b) a else b
    println(result)
}
fun isHoliday(dayOfWeek: Any){
    var any = when (dayOfWeek) {
        "월" -> false
        "화",
        "수",
        "목",
        "금" -> false
        "토", "일" -> true

        //"화"->{}
        in 2..4 -> {}
        in listOf("월", "화") -> {}
        else -> false//필수
    }
}