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

    println(0b101101)
    println(0b00001010)
    println(0b11111111 == 0xFF)  // = 255
    println(0b11111111_00000000_00000000 == 0xFF0000)

    println("Comparing to 248")
    println(0b1111_1000 == 248)
    println(0b11111100 == 248)
    println(0b1111_1110 == 248)
    println(0b1111_1111 == 248)

    println("Comparing to 0xA3")
    println(0b10100000 == 0xA3)
    println(0b11000001 == 0xA3)
    println(0b10100011 == 0xA3)
    println(0b00111011 == 0xA3)

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


    // bitwise operators
    //    1101
    // or 1000
    //---------
    //    1101
    println(0b1101 or 0b1000) //13

    //     1101
    // xor 1000
    //----------
    //     0101
    println(0b1101 xor 0b1000) // 5

    //inverse
    //0b10011.inv() 0b...01100
    // 0x0000001F == 0b00...0011111
    println(0b10011.inv() and 0x0000001F) // 0b01100
    // the 0x0 acts a filter for all the bits that we don't care about
    // leaving just the last 5 bits
    // without it we will get -20 and an answer


}