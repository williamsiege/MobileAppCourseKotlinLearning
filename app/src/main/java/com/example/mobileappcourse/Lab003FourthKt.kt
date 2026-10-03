package com.example.mobileappcourse
// "Open" used to allow inheritance for classes and methods
open class Student() {
    var studentName: String = ""
    var studentId: Int = 0
    var studentCourse: String = ""

    constructor(name: String, id: Int, course: String) : this() { // Secondary Constructor for Student Class
        //Initializing student attributes
        // A secondary constructor is an extra way to create an object, written inside the class body with the constructor keyword.
        // Kotlin needs them less than Java does, because the primary constructor plus default argument values covers most cases.
        studentName = name
        studentId = id
        studentCourse = course
    }

    open fun showDetails() {//Method to show student details
        println("Student Name: $studentName")
        println("Student ID: $studentId")
        println("Major: $studentCourse \n")
    }

    fun study() { println("$studentName is studying.") } //Method to simulate studying
}
class StudentCouncil : Student {//Child Class of Student inheriting properties and methods
    var studentRole: String

    constructor(newName: String, newId: Int, newCourse: String, newRole: String) :
            super(newName, newId, newCourse) {
        studentRole = newRole
    }

    override fun showDetails() {
        super.showDetails()
        println("Role: $studentRole")
    }
}

fun main() {
    // Creating an instance of the Student class by invoking the constructor
    val s001 = Student("Alice", 101, "BBIT")
    val s002 = Student("Bob", 102, "BBIT")
    val s003 = Student("Charlie", 103, "BBIT")
    val s004 = Student("David", 104, "BBIT")
    val s005 = Student("Eve", 105, "BBIT")

    s001.showDetails()// Calling the showDetails method
    s001.study()

    s002.showDetails()
    s002.study()

    s003.showDetails()
    s003.study()

    s004.showDetails()
    s004.study()

    s005.showDetails()
    s005.study()

    val c001 = StudentCouncil("Grace", 201, "BBIT", "Treasurer")
    c001.showDetails()
    c001.study()

}