package com.example.mobileappcourse
// Classes & Objects
class Student4( // Basics of Classes in Kotlin with  Primary Constructors
    val number: Int = 0,
    val name: String,
    val course: String,
    var academicYear: Int
) {
    init {
        introduce()
    }
    fun introduce(){
        println("Hi, My name is  $name with number $number. Studying $course in $academicYear")
    }

    fun askQuestion(): String =
        "$name (No. $number) asks: What is the difference between a class and an object?"

    fun ansQuestion(que: String): String =
        "$name answers \"$que\": A class is a blueprint, an object is one instance built from it."
}

open class Student2{ // Basics of Classes in Kotlin with Attributes and Methods. No constructors
    //Attributes
    var number: Int = 0
    var name: String = ""
    var course: String = ""
    var academicYear: Int = 1

    //Methods

    open fun introduce(){
        println("Hi, My name is  $name with number $number. Studying $course in $academicYear")
    }

    fun askQuestion(question: String): String {
        val question = ""
        return question;
    }
    fun answerQuestion(answer: String): String {
        val answer = ""
        return answer;
    }
}

 class Student3{
     var number: Int = 0
     var name: String = ""
     var course: String = ""
     var academicYear: Int = 1

     //Secondary Constructor
     constructor(number: Int, name: String, course: String, academicYear: Int){
         this.number = number
         this.name = name
         this.course = course
         this.academicYear = academicYear
         this.introduce()
     }

     fun introduce(){
         println("Hi, My name is  $name with number $number. Studying $course in $academicYear")
     }

     fun askQuestion(question: String): String {
         val question = ""
         return question;
     }
     fun answerQuestion(answer: String): String {
         val answer = ""
         return answer;
     }
 }
class StudentCouncil2: Student2(){
    val role: String = "Student Council President"

    override fun introduce() {
        println("I am $name, the $role.")
        super.introduce()
    }

}

fun main() {
    //Student Object in Kotlin.
    val s1 = Student2()
    s1.number = 105241
    s1.name = "John"
    s1.course = "Computer Science"
    s1.academicYear = 2
    s1.introduce()

    val s2 = Student4(105241, "John Doe", "Computer Science", 2)


    val s3 = Student3(105241, "John Doe", "Computer Science", 2)

    val sc = StudentCouncil2()
    sc.name = "Jane Doe"
    sc.introduce()


}

