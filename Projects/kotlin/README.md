# Kotlin

This repo has small mini projects used in learning Kotlin



## Scanner Input 

```kotlin
// next number
scanner.nextInt()
// next word
scanner.next()
// next line
scanner.nextLine()
// array of size `size`
var arr = IntArray(size) { scanner.nextInt() }
```

```java
// scanner
println("\n\nScanner - please input a string")
val scanner = Scanner(System.`in`)

// waiting for input
while(scanner.hasNext()){
    val input = scanner.nextLine()
    if(input == "exit") break
    // split
    val array = input.split(" ");
    // for faster than foreach
    for (item in array) {
        println(item)
    }
}
```

## String Tempates

```kotlin
"$variable"
"${variable.field}"
```

## Types

```java
val b0: Byte = 2
val s0: Short = 10
val n0: Int = 5
val l0: Long = 14
val f0: Float = 11.4f
```

### Object

`Object` is the root of all types

### Any

`Any` is the super type of all non-nullable types 

`Any?` is nullable

### Unit

`Unit` is returned by a method implicitly without being defined, if the method does not return anything

### Nothing

Used when the method never returns at all ie if we call a method and it's only job is to throw an exception

```kotlin
fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}
```

## Casting

```java
// double to long
val doubleA = 1.23
val longA = doubleA.toLong()
println("Converting double $doubleA to long $longA")

// double to int
val myInt = myDouble.toInt()
```

Byte + Byte = Int
Short + Short = Int
Int + Int = Long

## Char

```java
// character in a string
val myString = "This is a string"
val myChar = myString[0]
println("character 0 in string \"$myString\" is $myChar") 
// prints 'T'
```

comparing chars

```kotlin
val input3 = "a b"
val inputArray = input3.split(" ")
val char01 = inputArray[0].single()
val char02 = inputArray[1].single()
val same = char01.equals(char02, true)
println("Is $char01 the same as $char02 ignoring case? $same")
```

### Char Is Whitespace

```kotlin
if(!item.isWhitespace()) { }
```

### String to Char Array

```kotlin
var array = myString.toCharArray()
```

### String to Int Array

```kotlin
toInt()
toIntOrNull()
// string to array
myString.split(" ") then get element.toInt()
```

```kotlin
// find number of instances of a number given a string of numbers
val scanner = Scanner(System.`in`)
val numbers = "1 4 3 2 2 5"
val findMe = 2
println("finding $findMe in $numbers")
val numbersAsArray = numbers.split(" ")    
var count = 0
for (number in numbersAsArray) {
    println("${number.toInt()} equals $findMe? ${number.toInt() == findMe}")
    if(number.toInt() == findMe) {
        count++
    }
}
println(count) 
```

### Char in range

```kotlin
val input = Scanner(System.`in`).next().first()
println(input in 'A'..'Z' || input in '1'..'9')
```

### Char Array From String

```kotlin
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
```

## String

```kotlin
val myString = "hello"
println(myString.first())
println(myString.last())
```

### String comparing

```kotlin
val string1 = "a string"
val string2 = "another string"
if (string1 == string2) {}
```

## String Split

```java
// split
val array = input.split(" ");
```

## isNullOrEmpty

```java
if (!item.isNullOrEmpty())  println(item)
```

## For

```java
// for faster than foreach
for (item in array) {
    print(item + ", ")
}
```
## Conditions

```kotlin
import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val input = scanner.nextInt()
    if (input % 2 == 0) { 
        println(input + 2) 
    } else { 
      println (input + 1) 
    }
}
```

### In Range

```kotlin
if(5 in 5..15) {}
if('b' in 'a'..'c') {}  // true
if("hello" in "he".."hi") {}  // true as alphabetically falls in the ranges
```

```kotlin
val range = 100..200
if (300 in range) {}
```

## When 

```kotlin
val y = when (x) {
    "a" -> 1
    "b" -> 2
    else -> 3 
}
```

## Loops

### Repeat(n)

```kotlin
repeat(n){

}
```

### For

```kotlin
// inclusive loop
for (i in 1..4) 
// exclusive loop
for (i in 1 until 4) 
// decreasing
for (i in 4 downTo 1) {}
// characters
for (ch in 'a'..'c')
// step 
for (i in 1..7 step 2)
// foreach
for (item in myArray)
// foreach iterating over index
for (index in myArray.indices)
```

## Maths Operations

```java
// cube root
val largeNumber = 1000000.0
var cubeRoot = Math.cbrt(largeNumber)
println("\n\nCube root of $largeNumber is $cubeRoot")
```

## Arrays

### Array Literal

```kotlin
val vowels = arrayOf('a','e','i','o','u')
var numbers = arrayOf(1,2,3)
var numbers = intArrayOf(1,2,3)
println(numbers.joinToString())
val last = myArray.last()
val lastindex = myArray.lastIndex
```

### Array from lambda

```kotlin
// [0,0,0,0,0]
var zeros = IntArray(5)
// [0,1,2,3,4]
var increasing = IntArray(5) { item * 1}
```

### Numeric array

```kotlin
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
```

### Array From String

```kotlin
val (a, b, c, d, e) = Array(5) { scanner.nextInt() }
```



## Dates

```kotlin
import java.time.LocalDateTime
import java.time.LocalDate
println("\n\nPrinting the date")
println(LocalDateTime.now())
println(LocalDate.now())
var dateNow = LocalDate.now()
val year = dateNow.year
val month = dateNow.monthValue
val day = dateNow.dayOfMonth
val printDate = "$day $month $year"
println(printDate)
// 22 10 2020
```

## Functional Programming

With passing in lambdas into a function.

Here we pass in 2 functions and an integer.

```kotlin
fun functionalProgramming(value: Int, y: (Int) -> Int, g: (Int) -> Int): Int {
    println("\n\nFunctional programming")
    val output = y(g(value))
    println(output)
    return output
}
fun y(x: Int) = x * x
fun g(x: Int) = x * 2
```

and call it with 

```kotlin
functionalProgramming(10, ::y,::g)
```

### Functional Programming

Pass in arguments and a function into a function

Here is our functional method

```kotlin
fun functionalSquare(value: Int, context: Any, continuation: (Int, Any) -> Unit) {
    continuation(value * value, context)
}
```

It passes the square of the integer, and the type passed in, to whatever function is passed in.
Create the function below as the continuation function

```kotlin
fun doThis(x: Int ,y: Any) {
    println("\n\nFunctional Programming")
    println("passing in a function to a function ! Printing out $x and $y")
}
```

Then call it from main() using

```kotlin
functionalSquare(10, "a string", ::doThis)
/*
Functional Programming
passing in a function to a function ! Printing out 100 and a string
*/
```


## Functional Programming - Returning Functions

```kotlin
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
    return x/2
}
fun zero(x: Int): Int {
    return 0
}
```

and call it with 

```kotlin
fun main() {
    actionAnotherFunction()
}
/*
returning another function given function name of identity
10
returning another function given function name of half
5
returning another function given function name of zero
0
*/
```