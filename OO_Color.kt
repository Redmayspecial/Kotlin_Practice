package Kotlin_Practice

//class Color {
//    public val RED = 1
//    public val BLUE = 2
//    public val GREEN = 4
//}

enum class Color(val rgb: Int) {
    RED(0xFF0000),GREEN(0x00FF00),BLUE(0x0000FF), YELLOW(0xFFFF00);
    //The enum requires the ; separator if followed by a method

    fun containsRed(): Boolean{
        return false
    }
}


fun main(args: Array<String>) {
    // 0..9 -> 10 (decimal)
    // 0..9,A,B,C,D,E,F -> 0x10
    println(0x10)  // 16
    println(0x1F)  // 31
    println(0xFF)  // 255
    println(0x34)  // 52
    println(0x17)  // 23
    println(0XCAFEBABE)

    println(0x000000)  // Black
    println(0xFFFFFF)  // White
    println(0xFF0000)  // Red
    println(0x00FF00)  // Green
    println(0x0000FF)  // Blue
    println(0x000088)  // Dark Blue

    // binary numbers
    // 0..1 -> 0b1010

    printlin(0b)
}