package com.example.mobileappcourse

fun main(){

    val age  = 18

    if(age in 13..18){
        println("You are adult")
    }else{
        println("You are  a Teen ")
    }

    var decision: String = if(age in 13..18){
        "You can Vote"
    }else{
        "Not a teen"
    }
     repeat(times = 5){
         println(decision)
     }

}