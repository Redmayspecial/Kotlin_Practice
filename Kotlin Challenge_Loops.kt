package Kotlin_Practice

/**
Challenge: Loops
    For this challenge, try to write a program that calculates
    the sum of all numbers from 100 to 100,000 and prints out
    the result.

    You can check your solution by going to my GitHub page
    linked in this lecture’s resources.
 */


fun main(args: Array<String>) {

    /** This ran without the L designator but came with a different output of 705077754 which is problematic
     * as the The number 2,147,483,647 (or hexadecimal 7FFF,FFFF16) is the maximum positive value for a
     * 32-bit signed binary integer in computing.  Changing it to long yielded the correct output
     * GrandTotal Sum = 5000045050
     */

    var sum = 0L

    for (i in 100..100000L){
        sum += i
        println("Sum = $sum")
    }

    println("GrandTotal Sum = $sum")
}