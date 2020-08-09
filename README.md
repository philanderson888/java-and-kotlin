# java

## Contents

- [java](#java)
  - [Contents](#contents)
  - [Introduction](#introduction)
  - [Installation IntelliJ](#installation-intellij)
  - [Intellij Hello World](#intellij-hello-world)
  - [CodeWars Examples](#codewars-examples)
- [Variables](#variables)
  - [Char](#char)
  - [Loops](#loops)
    - [Foreach](#foreach)
  - [Collections](#collections)
    - [List](#list)

## Introduction

## Installation IntelliJ

## Intellij Hello World

```java
package com.example.helloworld;
import java.util.ArrayList;
import java.util.List;
public class HelloWorld {
    // New class com.example.helloworld.HelloWorld and create it
    // Shift and enter to move down a line
    public static void main(String[] args) {
         // control J to see available code templates
        // control dot to complete a word and add a dot (can do tab then .)
        // for the last item, press enter to select it
        // Alt 4 to see the command line window
        // Shift Shift = search everywhere
        // Control Control  = run anything ' hello '
        System.out.println("hello world 2");

        // build a JAR Java Archive  - File, Project Structure or  Shift control alt S
        // File, Structure, Artifacts, Add, Choose class and OK
        // Build => Artifacts and check folder out, artifacts, helloworld.jar

        // not too sure how to create another file so just going to do my coding here for now!
        // 8 August 2020
        // Codewars Capitalise Each Word https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java
        String phrase = "This is a 
    }
}

```

## CodeWars Examples

[Codewars](codewars.md)


# Variables

## Char

```java
char[] arr = { 'p', 'q', 'r', 's' };
//The method valueOf() will convert the entire array into a string.
String str = String.valueOf(arr);
System.out.println(str);
```

## Loops

### Foreach

```java
for (int num : numbers)  
{ 

} 
```

## Collections

### List

```java
// list is an interface
List<String> words = new ArrayList<String>();
```