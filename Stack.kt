package Kotlin_Practice

// DRY  Don't Repeat Yourself, more error prone and harder to upkeep.

// class Stack<E> {  / E for element  E T K V
class Stack<E>(vararg val items: E) {  // vararg allows for multiple arguments of type

    val elements = items.toMutableList()


    fun push(element: E) {
        // val array = intArrayOf(1,2,3)
        // val array = arrayOf(1,2,3)  //Kotlin has inferred the type of array.

        // arrayListOf(1,2,3,4)
        // val stack = Stack(1,2,3,4)
        elements.add(element)
    }

    fun pop(): E? {
        if (!isEmpty()) {
            return elements.removeAt(elements.size -1)
        }
        return null

    }

    fun isEmpty(): Boolean {
        return elements.isEmpty()
    }
}

fun <T> stackOf(vararg elements: T): Stack<T>{
    return Stack(*elements)  // *makes the stack of elements a vararg
}

// class IntStack : Stack() {

fun main(args: Array<String>) {
    val stack = Stack(3,5,2,8)
    // stack.push(11)


    val stack2 = stackOf("Hi", "Hey", "Hello")
    for (i in 1..3){
        println(stack2.pop())
    }

    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop())
    println(stack.pop()) //should cause elements beyond range - null
}