package Kotlin_Practice


//Challenge: Classes

//Create a class representing a book. Every book has a title, an author,
//  a publication year and is either borrowed or not.

//Choose an appropriate data type for each of these properties.
//  A book can be borrowed from you or returned to you. In both cases,
//  the borrowed property is updated accordingly.
// Also, a book should be able to print itself to the command line,
//  including its title, author, and publication year.

//You can check your solution by going to my GitHub page linked in this lecture’s resources.

class Book(val title: String, val author: String, val publicationYear: Int, var borrowed: Boolean) {

    fun display(){
        println("Book Title      : ${this.title}")
        println("Book Author     : ${this.author}")
        println("Publication Year: ${this.publicationYear}")
//        if (borrowed) {
//            println("Status          : Borrowed")
//
//        } else {
//            println("Status          : On Shelf")
//        }

    }

    fun bookBorrow() {
        if (this.borrowed) {
            println("Sorry, ${this.title} is already on loan.")
        } else {
            println("Enjoy ${this.title}.  Remember, it is due back in two weeks.")
            this.borrowed = true
        }
    }

    fun bookReturn() {
        if (this.borrowed) {
            println("Thank you for returning ${this.title}, we hope you enjoyed it.")
            this.borrowed = false
        } else {
            println("This copy of ${this.title} is already on the shelves.")

        }
    }

}

fun main(args: Array<String>) {
    var book = Book("Dune", "Frank Herbert", 1965,false)

    book.display()

    book.bookReturn()
    book.bookBorrow()
    book.bookBorrow()
    book.bookReturn()


}