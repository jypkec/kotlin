package com.example.kotlin

fun main(){
    val a : Int =3 // value
    var b : Int =10 // variable
    b = 20
    var user= User("채상아",10)
    user.name
    val kid = Kid("아이",3,"male")
}

open class User(open val name : String, open var age: Int){

}
class Kid(override val name: String, override var age:Int): User(name,age){
    var gender: String="female"
    init {
        println("초기화 중 입니다.")
    }

    //secondary constructor
    constructor(name: String,age: Int,gender:String):this(name,age){
        this.gender=gender
        println("부생성자 호출")

    }
}