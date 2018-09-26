package Kotlin_Practice

class Animal {
    var age: Int = 0
//        get() {
//
//        }
        get() = field
        set(value) {
            if (value >=0) {
                field = value
            }
        }
}

fun main(args: Array<String>) {
    val animal = Animal()
    animal.age = 8
    animal.age = -2  // answer will be 8 because 2 will not be allowed.
    println(animal.age)
}