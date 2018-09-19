package Kotlin_Practice

import java.util.*

// No parameters, no return value
fun helloWorld() {
    println("Hello World!")

}
// "Kotlin" -> K o t l i n"

// 1 Parameter, but no return value
fun printWithSpaces(text: String) {  //specifies the type of the value expected to be passed into the function
    for (char in text){
        print(char + " ")
    }
    println()
}

// No Parameters, returns Date
fun getCurrentDate(): Date { //putting the type behind the function indicates the type of value to be returned
    return Date()

}

// 2 Parameters, returns Int
fun max(a: Int, b: Int): Int  {
    if (a>=b) {
        return a
    } else {
        return b
    }
}

fun main(args: Array<String>) {
    helloWorld()
    printWithSpaces("Kotlin is awesome")
    println(getCurrentDate())
    println(max(17,42))
}
