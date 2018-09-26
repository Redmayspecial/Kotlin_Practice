package Kotlin_Practice

import java.time.Instant
open class Person(open val name:String, open var age:Int){  // OPEN a class and parameters that we can inherit from
//    val name: String
//    var age: Int

    init{
        this.name = name
        this.age = age
        println("Object was created")
    }

    fun speak(){
        println("Hello!")
    }

    fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth():Int {
        return 2016 - age
    }

    fun getYearOfBirth() = 2016 - age



}

class Student(override val name: String, override val age: Int): Person(name, age) {

}

class Employee(override val name: String, override val age: Int): Person(name, age) {
}

fun main(args: Array<String>) {
    val person = Person("Jack", 17)

    person.speak()
    person.greet("world")

    println(person.getYearOfBirth())
    println(person.name)
    println(person.age)





    //person.name = "Peter"
    //println(person.name)



}