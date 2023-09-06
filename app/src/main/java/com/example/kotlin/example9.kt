package com.example.kotlin

fun main(){
    //casting 안바꾸리 경우 null 반환
}

fun check(a: Any): String {
    return when (a) {
        is String -> {
            "문자열"
        }
        is Int -> {
            "숫자"
        }
        else -> {"몰라요"}
    }
}

fun cast(a:Any){
    if (a is String){
        (a as String).length
    }
    val result = (a as? String)?:"failed"
    println(result);
}

fun smartcast(a:Any): Int {
    return if(a is String){
        a.length
    }
    else if (a is Int){
        a.dec()
    }else{
        -1
    }
}