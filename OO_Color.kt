package Kotlin_Practice

//class Color {
//    public val RED = 1
//    public val BLUE = 2
//    public val GREEN = 4
//}

enum class Color(val rgb: Int) {
    RED(0xFF0000),GREEN(0x00FF00),BLUE(0x0000FF), YELLOW(0xFFFF00);
    //The enum requires the ; separator IF followed by a method

    fun containsRed(): Boolean{
        //do a bitwise comparison to see if the number compared contains an number in the red spectrum
        return this.rgb and 0xFF0000 != 0
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

    println(0b1010)
    println(0b00001010)
    println(0b11111111 == 0xFF)  // = 255
    println(0b11111111_00000000_00000000 == 0xFF0000)

    // and operator
    // 1 and 1 == 1
    // 1 and 0 == 0
    // 0 and 1 == 0
    // 0 and 0 == 0
    //
    //     1101
    // and 1011
    //-----------
    //  =  1001

    println(0b1101 and 0b1011)

    // 0x01CAFE and 0xFF0000 == x010000
    println(Color.RED.containsRed())
    println(Color.GREEN.containsRed())
    println(Color.BLUE.containsRed())
    println(Color.YELLOW.containsRed())

}