# Functional Programming

## Contents

- [Functional Programming](#functional-programming)
  - [Contents](#contents)
  - [Main Index](#main-index)
  - [Functional Programming](#functional-programming-1)
    - [Functional Programming](#functional-programming-2)
  - [Returning Functions](#returning-functions)
  - [Functional Programming - Filter](#functional-programming---filter)
  - [Functional Programming - Lambda](#functional-programming---lambda)
    - [Valid ways to call a function](#valid-ways-to-call-a-function)
    - [Filtering a string](#filtering-a-string)
  - [Predicate returns true or false](#predicate-returns-true-or-false)

## Main Index

[README](../README.md)

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


## Returning Functions

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

## Functional Programming - Filter

We can filter an input to obtain an output.  Lambdas are the perfect way to get this done

```kotlin
fun removeDotFromString(c: Char): Boolean = c != '.'
fun removeDotFromString2(c: Char): Boolean {
    return c != '.'
}

fun filterStringToRemoveDots(text: String){
    // why not working? println(text.filter { ::removeDotFromString })
    // why not working? println(text.filter { ::removeDotFromString2 })
    println(text.filter( { c: Char -> c != '.' }  ))
    println(text.filter( { c -> c != '.' }  ))
    println(text.filter() { c -> c != '.' })
    println(text.filter { c -> c != '.' })
    // version with 'it' where type is inferred
    println(text.filter { it != '.' })
}
```

## Functional Programming - Lambda

### Valid ways to call a function

```kotlin
val f1 = fun(number:Int) = number.toString()
val f2 = fun(number:Int): String { return number.toString()}
val f3 = {number:Int -> number.toString()}
val lambda = { x: Int -> a * x * x + b * x + c }
val lambda: (Long, Long) -> Long = TODO("Provide implementation")
```

```kotlin
fun polynomial(){
    val a = 1
    val b = 2
    val c = 3
    val lambda = { x: Int -> a * x * x + b * x + c }
    val output = lambda(10)
    println ("\n\nFunctional programming - printing the value of a polynomial ax2 + bc + c is $output")
}
polynomial()
```

These are equivalent

```kotlin
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
    // notice that the word 'return' is omitted but assumed last line is returned
    total
}
val output = multiply2(10,12)
println("\n\nFunctional programming - two longs in and print the product of all numbers inclusive in between - from 10 to 12 is $output")
```

### Filtering a string

This uses functional programming to filter out dots from a string

```kotlin
println(text.filter( { c: Char -> c != '.' }  ))
println(text.filter( { c -> c != '.' }  ))
println(text.filter() { c -> c != '.' })
println(text.filter { c -> c != '.' })
// version with 'it' where type is inferred
println(text.filter { it != '.' })
```

If code is several lines the last line is inferred as the return value

```kotlin
val output = inputText.filter {
    // some code
    !it.isDigit()
}
```

Also an early return can be defined as

```kotlin
val output = inputText.filter {
    if(!it.isDigit){
        return@filter true
    }
}
```

## Predicate returns true or false



```kotlin

```