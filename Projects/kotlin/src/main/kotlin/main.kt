import java.util.*
import javax.print.attribute.IntegerSyntax

fun main(args: Array<String>) {
    println("Hello World!")


    /*
    Jetbrains Academy Kotlin Tutorial Work
    Philip Anderson
    10 October 2020 onwards
    */

    // size
    println("\n\nPrinting the size of different fields")
    println(Integer.SIZE)
    println(Integer.MIN_VALUE)
    println(Integer.MAX_VALUE)

    // scanner
    println("\n\nScanner - please input a string")
    val scanner = Scanner(System.`in`)

    // waiting for input
    // while (scanner.hasNext()) {
    // val input = scanner.nextLine()
    //if (input == "exit") break
    // split
    val input = "here is some text"
    val array = input.split(" ");
    // for faster than foreach
    for (item in array) {
        println(item)
    }
    //}


    // for
    for (x in 0..10) print(x)

    // foreach
    for (item in array) {
        print(item + ", ")
    }

    // scanner input numbers
    println("\n\nScanner - input some numbers on one line, separated by spaces")
    val scanner2 = Scanner(System.`in`)
    // val input2 = scanner.nextLine()
    val input2 = "123 456      789"
    var array2 = input2.split(" ")
    for (item in array2) {
        if (!item.isNullOrEmpty()) println(item)
    }


    // input 2 strings and 2 numbers
    println("\n\nPrinting 2 lines of strings and numbers")
    val input3a = "hello world"
    val input3b = "123 456"
    val array3a = input3a.split(" ")
    val array3b = input3b.split(" ")
    for (item in array3a) println(item)
    for (item in array3b) println(item)


    val f: Float = (20.0).toFloat() + 20.02f // 1
    val l: Long = 10 + 2L        // 2
    val n: Int = l.toInt() + 5           // 3


    // double to long
    val doubleA = 1.23
    val longA = doubleA.toLong()
    println("Converting double $doubleA to long $longA")


    // character in a string
    val myString = "This is a string"
    val myChar = myString[0]
    println("character 0 in string \"$myString\" is $myChar")


    // get next even number
    val someNumber = 123456
    if (someNumber % 2 == 0) println(someNumber + 2)
    else println(someNumber + 1)

    // cube root
    val largeNumber = 1000000.0
    var cubeRoot = Math.cbrt(largeNumber)
    println("\n\nCube root of $largeNumber is $cubeRoot")

    // kotlin integer problem Intellij Academy
    /*
    https://hyperskill.org/learn/step/4499
    School
    Desk seats 2
    3 Groups each in own classroom
    find smallest number of desks
    */
    println("\n\nFind number of desks needed in a school")
    val groupa = 20
    val groupb = 21
    val groupc = 22
    var desksa = 0
    var desksb = 0
    var desksc = 0
    if (groupa%2 == 0) {
        desksa = groupa/2
    } else {
        desksa = groupa/2 + 1
    }
    if (groupb%2 == 0) {
        desksb = groupb/2
    } else {
        desksb = groupb/2 + 1
    }
    if (groupc%2 == 0) {
        desksc = groupc/2
    } else {
        desksc = groupc/2 + 1
    }
    println(desksa + desksb + desksc)


    // read 3 integers and print true if first between second and third
    val numberString = "40 100 20"
    val stringArray = numberString.split(" ")
    val first = stringArray[0].toInt()
    var second = stringArray[1].toInt()
    var third = stringArray[2].toInt()
    if (third < second) {
        val temp = third
        third = second
        second = temp
    }
    if (first >= second && first <= third) {
        println(true)
    } else {
        println(false)
    }

    /*
    https://hyperskill.org/learn/step/4536
    Party must have 10-20 cups or 15-25 at the weekend.  Numbers inclusive
    */
    val input1 = "16 false"
    val inputString = input1.split(" ")
    val cups = inputString[0].toInt()
    val weekend = inputString[1].toBoolean()
    var success = false
    if (weekend.equals(true)) {
        if (cups >= 15 && cups <= 25) {
            success = true
        }
    } else {
        if (cups >= 10 && cups <= 20) {
            success = true
        }
    }
    println(success)


    /*
    https://hyperskill.org/learn/step/4686
    Compare 2 characters
    10 October 2020
    */
    val input3 = "a b"
    val inputArray = input3.split(" ")
    val char01 = inputArray[0].single()
    val char02 = inputArray[1].single()
    val same = char01.equals(char02, true)
    println("Is $char01 the same as $char02 ignoring case? $same")



    /*
    https://hyperskill.org/learn/step/4687
    Check if 4 chars are numeric digits or not
    */
    val scanner4 = Scanner(System.`in`)
    val input4 = scanner4.nextLine()
    val inputArray4 = input4.split(" ")
    var output = ""
    for (i in 0..inputArray4.size-1){
        if (inputArray4[i].single().isDigit()) {
            output += "true"
        } else {
            output += "false"
        }
        if(i < inputArray4.size-1) {
            output += "\\"
        }
    }
    println(output)


    /*
    Working on this !

    import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val input4 = scanner.nextLine()
    val inputArray4 = input4.split(" ")
    var output = ""
    if(!input4.isNullOrEmpty()) {
        for (i in 0..inputArray4.size-1){
            //val isdigit = inputArray4[i].get(0).isDigit()
            //println(inputArray4[i])
            //println(inputArray4[i].single())
            val isdigit = inputArray4[i].single().isDigit()
            //println(isdigit)
            if (isdigit.equals(true)) {
                output += "true"
            } else {
                output += "false"
            }
            if(i < inputArray4.size-1) {
                output += "\\"
            }
        }
    } else {
        output = "false\\false\\false\\false"
    }

    println(output)
}
 
    */



    println("\n")
}