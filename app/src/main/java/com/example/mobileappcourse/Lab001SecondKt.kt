package com.example.mobileappcourse

fun main() {
    // Variables and Data Types
    val name: String = "Kotlin"
    var age: Int = 5    // Val is immutable, var is mutable
    val pi: Double = 3.14
    //  Nullable vs Non-Nullable. A nullable string can be null, while a non-nullable string cannot be null.
    var nullableString: String? = null  // nullableString can be null
    nullableString = ""
    println(nullableString.length)

    val nonNullableString: String = "Hello, Kotlin and java!" // nonNullableString cannot be null must contain a Value
    println(nonNullableString.length)
    // Control Structures
    if (age >4) {
        println("Kotlin is older than 4 years.")
    } else {
        println("Kotlin is younger than 4 years.")
    }
    age = 11
    when (age) {
        5 -> println("You are five years old.")
        10 -> println("You are ten years old.")
        else -> println("Age is not 5 or 10.")
    }
    for (i in 1 until 5) {
        println("Loop iteration is : $i")
    } // Kotlin's official API documentation defines until
    // as producing a range up to, but excluding, the specified upper value.
// Modified loop - while loop
    var i = 1
    while (i <= 5) {
        println("Loop iteration: $i")
        i++
    }
}


