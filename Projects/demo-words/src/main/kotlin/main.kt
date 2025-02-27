import java.io.File
import java.util.*
import java.time.LocalDateTime
import java.time.LocalDate
import kotlin.time.minutes
import kotlin.time.seconds
import kotlin.time.toDuration

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
    functionalSquare(10, "a string", ::doThis)
    actionAnotherFunction()
    filterStringToRemoveDots("This .. is .. some .. text ..")
    captureVariable()
    polynomial()
    multiplication()
    predicate('a')
    predicateAsLambda('a')
    findLongestWordInFile()
    wordsWithNumbers()
    getFileLength()
    linearPhoneBookSearch()
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
    println("Passing in $value then g(double to ${value*2}) and y(square) gives $output")
    return output
}

fun y(x: Int) = x * x

fun g(x: Int) = x * 2

fun functionalSquare(value: Int, context: Any, continuation: (Int, Any) -> Unit) {
    continuation(value * value, context)
}

fun doThis(x: Int ,y: Any) {
    println("\n\nFunctional Programming")
    println("passing in a function to a function ! Printing out $x and $y")
}

fun actionAnotherFunction() {
    /*
    https://hyperskill.org/learn/step/6000
    Implement a function generator.
    It returns the function by the name given. Support three functions:

    "identity" (returns its argument).
    "half" (returns its argument divided by 2).
    "zero" (returns 0).
    If the name is unknown, return the "zero" function.
    */
    println("${returnAnotherFunction("identity")(10)}");
    println("${returnAnotherFunction("half")(10)}");
    println("${returnAnotherFunction("zero")(10)}");
}

fun returnAnotherFunction(functionName: String): (Int) -> Int {
    println("\n\nreturning another function given function name of $functionName")
    if (functionName == "identity") {
        return ::identity
    } else if (functionName == "half") {
        return ::half
    } else {
        return ::zero
    }
}

fun identity(x: Int): Int {
    return x
}

fun half(x: Int): Int {
    println("x is $x and x/2 is ${x/2}")
    return (x/2)
}

fun zero(x: Int): Int {
    return 0
}

fun removeDotFromString(c: Char): Boolean = c != '.'

fun removeDotFromString2(c: Char): Boolean {
    return c != '.'
}

fun filterStringToRemoveDots(text: String){
    // println(text.filter { ::removeDotFromString })
    // println(text.filter { ::removeDotFromString2 })
    println(text.filter( { c: Char -> c != '.' }  ))
    println(text.filter( { c -> c != '.' }  ))
    println(text.filter() { c -> c != '.' })
    println(text.filter { c -> c != '.' })
    // version with 'it' where type is inferred
    println(text.filter { it != '.' })
}

fun captureVariable(){
    println("\n\nCapture Variable")
    var counter: () -> Int = {-42}

    fun reinitializeCounter(): Int {
        var value = 0
        var counter = { ++value }
        counter()
        return value
    }
    var f1 = fun(number:Int) = number.toString()
    var f2 = fun(number:Int): String { return number.toString()}
    var v3 = {number:Int -> number.toString()}
    var output = reinitializeCounter()
    println("Output is $output")
    println(counter())
    println(counter())
    println(counter())
}

fun polynomial(){
    val a = 1
    val b = 2
    val c = 3
    val lambda = { x: Int -> a * x * x + b * x + c }
    val output = lambda(10)
    println ("\n\nFunctional programming - printing the value of a polynomial ax2 + bc + c is $output")
}

fun multiplication(){
    /*
    https://hyperskill.org/learn/step/6164
    create a lambda to accept two long numbers and return product of all numbers in that range, inclusive
    */
    val multiply = fun(x: Long, y: Long): Long {
        var total: Long = 1
        for(i in x..y){
            total *= i
        }
        return total
    }
    val multiply2 = { x: Long, y: Long ->
        var total: Long = 1
        for (i in x..y) {
            total *= i
        }
        total
    }
    val output = multiply2(10,12)
    println("\n\nFunctional programming - two longs in and print the product of all numbers inclusive in between - from 10 to 12 is $output")
}

fun predicate(c: Char){
    /*
    https://hyperskill.org/learn/step/6163
    Predicate returns true or false on a collection
    */
    // given a predicate function which returns true if condition met, just return the opposite
    val notPredicate = fun( c: Char): Boolean {
        println("\n\nPredicate returns a boolean")
        var result = !originalPredicate(c)
        println("is $c equal to 'a' and then negate the result? $result")
        return result
    }
    notPredicate(c)
}

fun originalPredicate(c: Char): Boolean {
    var same = c.equals('a')
    println("does a equal a? $same")
    if (c.equals('a')) return true
    else return false
}

fun predicateAsLambda(c: Char){
    // repeat as lambda
    println(notPredicate(c))
}

fun notPredicate(c:Char) = { !originalPredicate(c) }

fun findLongestWordInFile() {
    val fileName = "words_sequence.txt"
    println("\n\nFinding longest word in a file $fileName")
    var maxLength = 0
    File(fileName).forEachLine {
        if(it.length > maxLength) {
            maxLength = it.length
        }
    }
    println("longest word has $maxLength characters")

}

fun wordsWithNumbers(){
    val file = File("words_with_numbers.txt")
    println("\n\nfinding the count of whole numbers in a text file")
    var counter = 0
    file.forEachLine {
        val number = it.toIntOrNull()
        if(number != null){
            counter++
        }
    }
    println("the number of lines containing just a number in this file is $counter")
}

fun getFileLength(){
    val file = File("oneline.txt")
    // this reads the number of ASCII characters in the file
    val fileLength = file.length()
    // number of lines in the file ie the size of the array when read all lines into it
    val lines = file.readLines().size
    println("\n\nReading file with only one line in it - length is $fileLength and size is $lines")
}

fun linearPhoneBookSearch(){
    /*
    https://hyperskill.org/projects/86/stages/476/implement
    Goal is to search a very large phone book and to obtain the phone numbers of given people from it in an efficient manner
    Phone book is local file at c:\deletemejava\telephonedirectory\directory.txt
    also copy made locally of a tiny portion of this file at directory.txt for future compatibility!
    */
    println("\n\nCreating a phonebook then finding items in it given 2 files 'directory.txt' and 'find.txt'")
    val startTime = System.currentTimeMillis()
    println("starting search at time ${startTime}")
    val file = File("data\\directory.txt")
    val phonebook = hashMapOf<Int,String>()
    file.forEachLine {
        val line = it.split(" ")
        val phone = line[0].toInt()
        var person = line[1] + " " + line[2]
        phonebook[phone] = person
    }
    println(phonebook)
    // now search the map!!!
    if(phonebook.containsValue("Eustacia Helge")){
        println("phonebook contains Eustacia Helge")
    }
    // now get our text file, iterate the values and print out the ones that are a match!
    val findEntries = File("data\\find.txt")
    findEntries.forEachLine {
        if(phonebook.containsValue(it)){
            println("Phonebook contains $it")
        }
    }
    // now go for the big file
    val bigFile = File("C:\\deletemejava\\telephonedirectory\\directory.txt")
    val bigPhonebook = hashMapOf<Int,String>()
    bigFile.forEachLine {
        val line = it.split(" ")
        val phone = line[0].toInt()
        var person = ""
        var first = true
        for(name in line) {
            if (first) {
                first = false
            } else {
                person += name + " "
            }
        }
        person = person.trim()
        bigPhonebook[phone] = person
    }
    println("phonebook size is now ${bigPhonebook.size}")
    var counter = 0
    for(item in bigPhonebook){
        counter++
        if(counter>50) break
        print("${item.value}, ")
    }
    println()
    var matches = mutableListOf<String>()
    findEntries.forEachLine {
        if(bigPhonebook.containsValue(it)){
            matches.add(it)
            println("Main phonebook contains $it")
        }
    }
    println("There are ${matches.size} matches ie $matches")
    val finishTime = System.currentTimeMillis()
    println("Finished at ${finishTime}")
    val timeDifference = (finishTime - startTime)
    println(String.format("%1\$tM min. %1\$tS sec %1\$tL ms.",timeDifference))
}


