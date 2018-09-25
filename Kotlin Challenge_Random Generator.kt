package Kotlin_Practice

import java.util.*


/***
 * Challenge: Conditionals
        Generate a random number between 1 and 50 using the following code:

            val random = Random().nextInt(50) + 1

        IntelliJ helps you import the Random class from Java so that you can use it.
        Don’t worry about the details of imports for now.

        Now, use a when statement to switch between the cases where random
        is in the range 1 to 10, 11 to 20, 21 to 30, 31 to 40, or above 40.

        In each case, print out a message containing the range and the exact
        value of random.

        Test your code in a Kotlin_Practice.functions.main() function and run it several times to get
        different random numbers.

        You can check your solution by going to my GitHub page linked in this
        lecture’s resources.
 */

fun main(args: Array<String>){

    val random = Random().nextInt(50) + 1

    when (random) {
        in 1..10 -> println("Your random number, $random,  is between 1 and 10")
        in 11..20 -> println("Your random number, $random,  is between 11 and 20")
        in 21..30 -> println("Your random number, $random,  is between 21 and 30")
        in 31..40 -> println("Your random number, $random,  is between 31 and 40")
        else -> println("Your random, $random, is over 40")
    }



}