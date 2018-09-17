package Kotlin_Practice

/**
 * Challenge: Recap the Basics
 *
    Create an array list of your favorite book titles. Loop over this list and,
    if the title contains the letter ‘e’, print each character of the name on a new line.

    You can check your solution by going to my GitHub page linked in this
    lecture’s resources.
 */

fun main(args: Array<String>) {
    //Build an array of books

    val bookarray = arrayOf("Dune", "To Kill a Mockingbird", "Starship Trooper","Moby Dick", "Ender's Game", "1984", "Catch-22")

    //Loop over the array of books
    for (book in bookarray){
        // Look to see if the element in the array contains "e"
        if (book.contains("e")){
            // If the element contains "e" Create a loop around the length of the book
            for (char in book) {
                //println each character in the array element
                println(char)
            }
            // After a book gets printed, add two spaces to separate it from the next book for better readability.
            println()
            println()


        }

    }


}


