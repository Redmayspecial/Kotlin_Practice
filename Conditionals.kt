package Kotlin_Practice

fun main(args: Array<String>) {
    val x = 9
    when(x) {
        5 -> println("x is 5")
        3*12 -> println("x is 3 * 12")
        "Hey there".length -> println("s is the lenght of the string 'Hey there'")
        in 1..10 -> println("x is between 1 and 10")
        in 11..20 -> println()
        in 21..300 -> println()
        !in 1..9 -> println("x is not between 1 and 9")

    }
}



/** the conditional takes the value of the last expression
fun Kotlin_Practice.functions.main(args: Array<String>) {
    val mode: Int = 3

    val result = when (mode) {
        1 -> "The mose is lazy."
        2 -> {
            println("The mode is 2")
            val i: Int = 3
            "So the mode is busy"
        }
        3 -> "The mode is super-productive."
        else -> "I don't know that mode."
    }

    println(result)

    val x = if (mode < 2){
        println("Mode is less than ")
        17  /* the conditional takes the value of the last expression */


    } else {
        42
    }

    println(x)
}

 For TESTING THE WHEN CONDITIONALS
fun Kotlin_Practice.functions.main(args: Array<String>) {
    val mode: Int = 5

    when (mode) {
        1 -> println("The mose is lazy.")
        2 -> {
            println("The mode is 2")
            println("So the mode is busy")
        }
        3 -> println("The mode is super-productive.")
        else -> println("I don't know that mode.")
    }
}


 *
 * For TESTING THE IF CONDITIONALS
 *
fun Kotlin_Practice.functions.main(args: Array<String>) {
    val age: Int = 28
    if (age < 18) {
        println("You cannot register.")
    } else if (age < 21) {
        println("Well, maybe you can register.")
    } else if (age < 27) {
        println("You should be able to register.")
    } else {
        println("You're good to go!")
    }

    println("The End.")
}

**/