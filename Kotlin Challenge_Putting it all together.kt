package Kotlin_Practice

//Challenge: Object-Orientation

////Let’s say we’re running a library where you can lend books and also some
////movies. We want to write an application to keep track of our inventory.

////Create an interface Lendable that defines a borrow() method. Then create an
////abstract class InventoryItem and two classes Book and DVD which inherit from
////InventoryItem. InventoryItem should implement the Lendable interface.
////Books and DVDs both have a title, genre and publication year. Books also have
////an author whereas DVDs have a length in seconds. Add each property to the
////most suitable class.

////You can check your solution by going to my GitHub page linked in this lecture’s
////resources.

interface Lendable {
    fun borrow()
}

abstract class InventoryItem(open val title: String,open val genre: String, open val publicationYear: Int) {

}

class Books(override val title: String, override val genre: String, override val publicationYear: Int, val author: String) : InventoryItem(title, genre, publicationYear), Lendable {
    override fun borrow() {
        println("Thanks for borrowing $title by $author")
    }
}

class DVDs(override val title: String, override val genre: String, override val publicationYear: Int, val lengthInSeconds: Int) : InventoryItem(title, genre, publicationYear), Lendable {
    override fun borrow() {
        println("Thanks for borrowing $title with a runtime of $lengthInSeconds seconds.")
    }
}


fun main(args: Array<String>) {

    val book = Books(title ="Dune", genre = "Science Fiction", publicationYear = 1961, author = "Frank Herbert")
    book.borrow()

    val dvd = DVDs(title ="Dune", genre = "Science Fiction", publicationYear = 1984, lengthInSeconds = 11820)
    dvd.borrow()

}