package Kotlin_Practice

open class Animal {
//    var age: Int = 0
//        get() {
//
//        }

//        get() = field
//        set(value) {
//            if (value >=0) {
//                field = value
//            }
//        }

    // You should use private in general.
    private var age: Int = 0 //strict visibility modifier, can't access this varialbe outside the class
    protected var name = "Sam" //can be accessed in subclasses
    internal val isDangerous = true //can be accessed anywhere inside the module.
    // public //anything can access the variable, property, method


   // private or public
    public fun isOld(param: String): Boolean {
        return age > 12
    }

class Vertebrate: Animal() {


    fun introduceYourself() {
    println(this.name)
    }
}


}

fun main(args: Array<String>) {
    val animal = Animal()

//    animal.age = 8
//    animal.age = -2  // answer will be 8 because 2 will not be allowed.
//    println(animal.age)
}