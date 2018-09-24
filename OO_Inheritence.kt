package Kotlin_Practice

open class Person (open val name:String, open var age:Int){  // OPEN a class and parameters that we can inherit from
//    val name: String
//    var age: Int

    init{
        println("Object was created")
    }

    fun speak(){
        println("Hello!")
    }

    fun greet(name: String) {
        println("Hello $name!")
    }


    fun getYearOfBirth() = 2016 - age

}

class Student(override val name: String, override var age: Int, val studentID: Long): Person(name, age) {

    fun isIntelligent() = true

}

class Employee(override val name: String, override var age: Int): Person(name, age) {

    fun receivePayment() {
        println("Received payment.")
    }
}

fun main(args: Array<String>) {

    val student = Student("John", 25, 3647284)
    student.speak()

    println(student.isIntelligent())

    val employee = Employee("Mary", 32)
    employee.getYearOfBirth()

    employee.receivePayment()








}