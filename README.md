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
      - [List To Array](#list-to-array)
    - [Convert Set To List](#convert-set-to-list)
  - [Sets](#sets)
    - [Concrete implementations](#concrete-implementations)
    - [Set Methods](#set-methods)
    - [Getting data out of a set](#getting-data-out-of-a-set)
    - [Convert Set To List](#convert-set-to-list-1)

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

Check this out for reference http://tutorials.jenkov.com/java-collections/

### List

`List` is an `Interface`

`List` has an `index` and can have duplicates

```java
List<String> words = new ArrayList<String>();
```

#### List To Array

Convert list of integers to array of integers

```java
var list = new ArrayList<int>();
int[] output = list.stream().mapToInt(item->item).toArray();
```

### Convert Set To List

```java
Set<String> set = new HashSet<>();
List<String> list = new ArrayList<>();
list.addAll(set);
```

## Sets

`Set` has `unique objects` and `no particular order`

`java.util.Set` has unique objects

`Set` is an Interface

`Set` inherits from `Collection` Interface


### Concrete implementations

1. EnumSet
2. HashSet   no guaranteed order.  Related to hashmap

```java
Set set = new HashSet();
Set set<String> = new HashSet<String>();
for (String item : set) {}

```

3. LinkedHashSet   order same as insertion

```java
Set set = new LinkedHashSet();
```

4. TreeSet      order same as if it were a List eg alphabetical or numeric order
   
```java
Set set = new TreeSet();
```

### Set Methods

set.Add()
set.Remove()
set.Clear()
set.addAll(anotherSetToAddToThisOne)
set.removeAll(removeAllElementsWhichMatchThisOtherSet)
set.retainAll(retainAllElementsPresentInThisSet)
set.size()
set.isEmpty()
set.contains(item)

### Getting data out of a set

1. Iteratable
   
```java
Iterator<String> iterator = set.iterator();
while(iterator.hasNext()){
  String item = iterator.Next()
}
```

2. Foreach
   
3. Stream

```java
Stream<String> stream = set.stream();
stream.forEach(  (item) => {    })
```

### Convert Set To List

```java
Set<String> set = new HashSet<>();
List<String> list = new ArrayList<>();
list.addAll(set);
```

