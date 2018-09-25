package Kotlin_Practice

fun main(args: Array<String>) {
    outer@ for (i in 1..10){
        for (j in 1..10){
            if (i - j == 5) {
                break@outer
            }
            println("$i - $j")
        }
    }
}

/**
fun Kotlin_Practice.functions.main(args: Array<String>) {
    for (c in "Python"){
        if (c == 'o'){
            break
        }
        print(c)
    }
    println()

    val list = listOf("Book","Table", "laptop")
    for (str in list){
        if(!str.contains('o')){
            continue
        }
        //Calculations...
        println(str)
    }

}




//While loops
fun Kotlin_Practice.functions.main(args: Array<String>) {
    var x = 9
    while(x >= 0){
        println(x)
        //x = x - 1
        x--
        // x = x + 1
        // x++
    }

    var i = 1
    while (i <= 10) {
        println(i)
        i++
    }



}

 FOR LOOPS
fun Kotlin_Practice.functions.main(args: Array<String>) {
    var sum = 0
    for(i in 1..100){
        sum = sum + i
    }
    println(sum)

    val list = listOf("Java", "Kotlin", "Python")
    for(element in list){
        println(element)
    }

    for((index, value) in list.withIndex()){
        println("Element at $index is $value")
    }
}
 */