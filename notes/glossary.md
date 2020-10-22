# Glossary

- [Glossary](#glossary)
  - [IntelliJ Idea IDEA Shortcuts and tips](#intellij-idea-idea-shortcuts-and-tips)
  - [Kotlin](#kotlin)
  - [Maven](#maven)
  - [POJO](#pojo)

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