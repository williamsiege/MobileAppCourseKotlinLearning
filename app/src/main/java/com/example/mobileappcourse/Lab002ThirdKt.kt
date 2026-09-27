package com.example.mobileappcourse

// Regular function to add two numbers
fun add(a: Int, b: Int): Int {
    return a + b
}
// Compact (single-expression) function to add two numbers
fun addCompact (a: Int, b: Int): Int = a + b
// Add Function rewritten as a lambda stored in a variable
val addLambda: (Int, Int) -> Int = { a, b -> a + b }
// Higher Order function to add two numbers
fun sumHigherOrder(a: Int, b: Int, operation: (Int, Int) -> Int): Int{ //Higher Order Function
    return a+ b+ operation(a,b)
}
// Modified add that returns a function type
fun addModified(a: Int): (Int) -> Int {
    return { b -> a + b }
}


fun main() {

    val sum = add(5, 3)
    val sumCompact = addCompact(5, 3)
    val sumLambda = addLambda(5, 3)
    val sumHigherOrder = sumHigherOrder(5, 3, addLambda)
    val add5 = addModified(5)
    val result = add5(3)

    println("The sum is $sum")
    println("The sum (compact) is $sumCompact")
    println("The sum (lambda) is $sumLambda")
    println("The sum (higher order) is $sumHigherOrder")
    println("The result is $result")

}