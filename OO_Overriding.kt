package Kotlin_Practice

abstract class Course(val topic: String, val price: Double){
    open fun learn() {
        println("Learning a $topic course.")
    }
}

interface Learnable {
    fun learn() {
        println("Learning...")
    }
}

//open class KotlinCourse() : Course ("Kotlin", 999.99) {
//    override final fun learn() {  //final stops the possibility to allow this function to be override
//        super.learn()  //Points to fun from parent class
//        println("I'm one of the first people to learn Kotlin")
//    }
//
//}

open class KotlinCourse() : Course ("Kotlin", 999.99), Learnable {
    override final fun learn() {  //final stops the possibility to allow this function to be override
        super<Course>.learn() //angle brackets specifies which parent Class I mean to pull from
        println("I'm one of the first people to learn Kotlin")
    }

}


fun main(args: Array<String>) {
    val course = KotlinCourse()
    course.learn(

    )
}