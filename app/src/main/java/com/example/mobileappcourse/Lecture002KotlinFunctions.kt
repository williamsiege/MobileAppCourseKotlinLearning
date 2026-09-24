package com.example.mobileappcourse
//Learning Functions in Kotlin
fun main(args: Array<String>): Unit{ //Main function signature
    // Calling a function
    var total:Int = sum(89,20)
    var sumOverload: Int = sumOver(10)
    var sumCompact: Int = sumCompact(40,20)

    println("The Sum of 40 and 20 is: $sumCompact")
    println("The Number is 10 and the Sum is: $sumOverload")
    println("The total is: $total")
    println("The sum of 10 and 20 is: ${sum(10,20)}")
    introduce()

} // Kotlin has no strict on access Modifiers

fun sum( a:Int, b:Int): Int{   //Function signature(Unique ID)
    return a+b
    // Function Body (Implementation)
}

fun introduce(): Unit{  //Unit is similar to void in Java
    println("Hello, I am a Kotlin Function")
}
//read on Polymorphism for Kotlin
// Solving Problem of Method Overloading: Default Parameters
// Required Parameters...
//Named Arguments
fun sumOver(a: Int, b: Int = 0, c: Int = 0): Int{ //Default Parameters
    return a+b+c
}

// Compact Functions
fun sumCompact(a: Int, b: Int) :Int = a+b //Function Compacted..

//LAMBDAS and Higher Order Functions
//First Class
val sumLambda: (Int, Int) -> Int = {a: Int, b: Int -> a+b} //Lambda Function // Stores Function type
// A function can be treated as a datatype ,but it is not a datatype
// Function Types.
fun sumHof(a: Int, b: Int, operation: (Int, Int) -> Int): Int{ //Higher Order Function
    return a+ b+ operation(a,b)
}
// A function that returns a functionType :LAMBDA Function..




