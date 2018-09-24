package Kotlin_Practice

class Book(val title: String, val author: String, val publicationYear: Int, var price: Double) {
    override fun toString(): String {
        return "Book[title=$title, author=$author, publicationYear=$publicationYear, price=$price]"
    }
}

data class DataBook(val title: String, val author: String, val publicationYear: Int, var price: Double) {

    fun print() {
        print("Something")
    }
}  // cannot have abstract data classes

fun main(args: Array<String>) {
    val book = Book("Super Book", "John Doe", 2017, 99.99)
    val book2 = Book("Super Book", "John Doe", 2017, 99.99)
    val databook = DataBook("Super Book", "John Doe", 2017, 99.99)
    val databook2 = DataBook("Super Book", "John Doe", 2017, 99.99)
    val databook3 = databook.copy(price = 98.99)

    val (title, author, year, price) = databook //assigns the values in databook to the vals in ()
    val set = hashSetOf(databook, databook2, databook3)
    val set2 = hashSetOf(book, book2)
    println(set)
    println(set2)


    println(book)
    println(databook)
    println(databook3)
    println(title)
    println(author)


    println(book.equals(book2))
    println(databook.equals(databook2))

}
