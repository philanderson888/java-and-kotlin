# Kotlin

This repo has small mini projects used in learning Kotlin



## Scanner Input 

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

## Types

```java
val b0: Byte = 2
val s0: Short = 10
val n0: Int = 5
val l0: Long = 14
val f0: Float = 11.4f
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
```

## Maths Operations

```java
// cube root
val largeNumber = 1000000.0
var cubeRoot = Math.cbrt(largeNumber)
println("\n\nCube root of $largeNumber is $cubeRoot")
```

## Arrays

Numeric array

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

