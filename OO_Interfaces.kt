package Kotlin_Practice

interface Drivable{
    fun drive()

}

interface Buildable {
    val timeRequired: Int
    fun build() {
        println("Building something...")
    }
}

class Car(val color: String): Drivable, Buildable {
    override val timeRequired = 120
    override fun drive(){
        println("Driving car...")
    }
    override fun build() {
        println("Built a shiny car.")
    }
}

class MotorCycle(val color: String): Drivable {
    override fun drive() {
        println("Driving motorcycle.")
    }
}

fun main(args: Array<String>) {
    val car: Drivable = Car("blue")
    car.drive()
    val motorcycle: Drivable = MotorCycle("red")
    motorcycle.drive()

}