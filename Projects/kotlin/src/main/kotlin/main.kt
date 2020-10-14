import java.util.*
import javax.print.attribute.IntegerSyntax
import java.time.LocalDateTime
import java.time.LocalDate

fun main(args: Array<String>) {
    size()
    scanner()
    loop()
    stringSplit()
    dataTypes()
    getNumberOfSchoolDesks()
    isNumberWithinBounds()
    isPartyASuccess()
    characterEquals()
    isCharAlsoDigit()
    isCharCapitalLetter()
    isNumberInRange()
    isNumberInTwoRanges()
    largestNonDescendingSequence()
    setCalendarDate()
    cycleArrayElements(6, "1 2 3 4 5 6 ", 2)
    functionalProgramming(10, ::y,::g)
    println("\n")
}

fun size() {

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
}

fun scanner() {
    println("\n\nScanner - please input a string")
    val scanner = Scanner(System.`in`)
    // waiting for input
    // while (scanner.hasNext()) {
    // val input = scanner.nextLine()
    //if (input == "exit") break
    // split
    val input = "here is some text"
    val array = input.split(" ");
    for (item in array) {
        println(item)
    }
}

fun loop() {
    // for
    for (x in 0..10) print(x)
    // foreach
    val input = "here is some text"
    val array = input.split(" ");
    for (item in array) {
        print(item + ", ")
    }
}

fun stringSplit() {
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
}

fun dataTypes() {
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
}

fun characterEquals() {
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

}

fun isCharAlsoDigit() {
    /*
    https://hyperskill.org/learn/step/4687
    Check if 4 chars are numeric digits or not
    Phil 11 October 2020
    */
    println("\n\nFinding numeric digits in a string of characters")
    val input5 = "a b 1 2"
    val input5CharArray = input5.toCharArray()
    var counter5 = 0
    var output5 = ""
    for (item in input5CharArray) {
        if (!item.isWhitespace()){
            if (item.isDigit()) {
                output5 += "true"
            } else {
                output5 += "false"
            }
            if(counter5 == 3) break
            output5 += "\\"
            counter5++
        }
    }
    println(output5)
}

fun isCharCapitalLetter() {
    /*
    https://hyperskill.org/learn/step/4685
    Read char and see if it is a capital letter or numeric digit
    */
    val digit06 = 'a'
    println("\n\nFind out if char $digit06 is capital letter or numeric digit")
    if (!digit06.isWhitespace()) {
        if (digit06.isDigit()) {
            if (digit06.equals('0')) {
                println("false")
            } else {
                println("true")
            }
        } else if (digit06.isUpperCase()) {
            println("true")
        } else println("false")
    }

}

fun getNumberOfSchoolDesks() {
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
}

fun isNumberWithinBounds() {


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

}

fun isPartyASuccess() {
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
}

fun isNumberInRange() {
    /*
    https://hyperskill.org/learn/step/4670
    Get a job if age in 18..59
    */
    val age08 = 33
    val min = 18
    val max = 59
    if(age08 in min..max) {
        println("true")
    } else {
        println("false")
    }

}

fun isNumberInTwoRanges() {
    /*
    https://hyperskill.org/learn/step/4677
    given string of ranges is last number in one of the two ranges
    */
    val input09 = "10 20 30 40 35"
    val input09Array = input09.split(" ")
    val range0901 = input09Array[0].toInt()..input09Array[1].toInt()
    val range0902 = input09Array[2].toInt()..input09Array[3].toInt()
    val number09 = input09Array[4].toInt()
    println("\n\nIs $number09 in range $range0901 or $range0902?")
    if (number09 in range0901 || number09 in range0902) {
        println("true")
    } else {
        println("false")
    }

    /*
    https://hyperskill.org/learn/step/4678
    is number in both ranges given?
    */
    val input10 = "10 20 30 40 35"
    val input10Array = input10.split(" ")
    val input10range01 = input10Array[0].toInt()..input10Array[1].toInt()
    val input10range02 = input10Array[2].toInt()..input10Array[3].toInt()
    val number10 = input10Array[4].toInt()
    if (number10 in input10range01 && number10 in input10range02) {
        println("true")
    } else {
        println("false")
    }
}

fun largestNonDescendingSequence() {
    /*
    https://hyperskill.org/learn/step/4702
    Longest non-decreasing sequence of numbers in a string
    */
    val numbers = 8
    val array1 = arrayOf(1,4,6,99,34,23,0,-1)
    print("\n\nFinding the largest sequence of increasing numbers in ")
    var previous = 0
    var sequence = 0
    var sequenceMax = 1
    for(number in array1) {
        print("$number, ")
        if (number >= previous) {
            sequence++
            if (sequence > sequenceMax) {
                sequenceMax = sequence
            }
        } else {
            sequence = 1
        }
        previous = number
    }
    println("\nLargest non decreasing sequence is $sequenceMax")

}

fun setCalendarDate(){
    /*
    https://hyperskill.org/learn/step/6781
    Print out the date
    */
    println("\n\nPrinting the date")
    println(LocalDateTime.now())
    println(LocalDate.now())
    var dateNow = LocalDate.now()
    val year = dateNow.year
    val month = dateNow.monthValue
    val day = dateNow.dayOfMonth
    val printDate = "$day $month $year"
    println(printDate)
}

fun cycleArrayElements(size: Int, numbers: String, swaps: Int) {
    /*
    https://hyperskill.org/learn/step/4697
    shift whole array n places to the right
    */
    //val scanner = Scanner(System.`in`)
    //val size = scanner.nextInt()
    //val numbers = IntArray(size)
    //for (i in 0..size-1) {
    //    numbers[i] = scanner.nextInt()
    //}
    //val swaps = scanner.nextInt()
    val size = 6
    val numbers = arrayOf(1,4,2,6,5,3)
    val swaps = 2
    //println("${numbers.joinToString()}")
    // repeat n times
    repeat(swaps) {
        val last = numbers.last()
        for (j in (size-1) downTo 1) {
            numbers[j] = numbers[j-1]
        }
        numbers[0] = last
    }
    //println("${numbers.joinToString()}")
    var output = ""
    for (i in 0..size-1) {
        output += "${numbers[i]} "
    }
    println(output)
    // code is too slow so refactor it a bit.
    // instead of multiple jumps can get this to do just one jump!
    // create a new array and just fill it in one go
    val swapped = IntArray(size)
    for (i in 0..size-1) {
        var index = i + swaps
        if (index > (size-1)) {
            index = index - size
        }
        swapped[index] = numbers[i]
    }
    println("${swapped.joinToString()}")
    output = ""
    for (i in 0..size-1) {
        output += "${swapped[i]} "
    }
    println(output)
}

fun functionalProgramming(value: Int, y: (Int) -> Int, g: (Int) -> Int): Int {
    println("\n\nFunctional programming")
    val output = y(g(value))
    println(output)
    return output
}
fun y(x: Int) = x * x
fun g(x: Int) = x * 2
