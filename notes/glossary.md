# Glossary

- [Glossary](#glossary)
  - [IntelliJ Idea IDEA Shortcuts and tips](#intellij-idea-idea-shortcuts-and-tips)
  - [Kotlin](#kotlin)
  - [Maven](#maven)
  - [POJO](#pojo)
  - [Sorting](#sorting)
  - [Jump Search = Block Search](#jump-search--block-search)
  - [Bubble Sort](#bubble-sort)

## IntelliJ Idea IDEA Shortcuts and tips

Keyboard Shortcuts
- Alt + Enter gives contextual help

## Kotlin

Kotlin can be added to a project using

```java
build.gradle
plugins{
  id("org.jetbrains.kotlin.multiplatform").version("1.3.61")
  id("com.android.application")  // or .library
}
// also set target platform eg android, ios, linux, wasm
kotlin{
  jvm()
  js("nodeJs"){...}
  js("browser"){...}
  android()
}
// also source setss
sourceSets{
    commonMain{}
}
```







## Maven

Aims at best practice

- Change log from source control
- Cross reference sources
- Mailing lists
- Dependencies
- Unit test reports

## POJO 

Plain Old Java Object

## Sorting

In-place or out-of-place sorting?

Internal within RAM or external using database or hard drive

## Jump Search = Block Search

Create blocks size Math.Floor(SQRT(n)) which gives a time complexity of O(SQRT(n))

Find the block with the max/min surrounding the desired entry and then search the block

We jump to the block greater than our number then do a backwards search to find our item

## Bubble Sort

Is O(n squared)



