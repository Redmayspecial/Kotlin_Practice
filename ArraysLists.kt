package Kotlin_Practice

fun main(args: Array<String>) {
    //Arrays
    val array = arrayOf("Tesas", "Iowa", "California")
    val mixed = arrayOf("Kotlin", 17, 3.0, false)
    val numbers = intArrayOf(1,2,3,4,5)
/*    println(mixed[0])

    mixed[2] = 3.1415

    println(mixed[2])

    val str = "Udemy"
    println(str[0])

    val states = arrayOf("Nevada", "Florida")
    val allStates = array + states

    println(allStates.size)

    val empty: Boolean = numbers.isEmpty()

    if (states.contains("Kentucky")) {
        println("It contains Kentucky")
    } else {
        println("It does not")
    }*/

    //Lists
    //val list = listOf("Orange", "Apple", "Bananas")

    //Other
    val arraylist = arrayListOf("Patrick", "Michael", "Sarah")
    val list = arrayListOf("Peter")

    println(arraylist[0])
    println(arraylist + list)
    println(arraylist.size)
    println(arraylist.isEmpty())
    println(arraylist.contains("Sarah"))

    arraylist.add("Josh")
    val changed = arraylist.add(1,"Jack")

    println(arraylist)

    // val removed = arraylist.remove("Josephine")
    val removed = arraylist.remove("Michael")
    println(arraylist)
    println(removed)

    val sublist = arraylist.subList(1,4)
    //val sublist = arraylist.subList(1,2)

    println(sublist)








}