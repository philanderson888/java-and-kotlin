# Testing

## Contents

- [Testing](#testing)
  - [Contents](#contents)
  - [Getting Started](#getting-started)
    - [Switching between code and test](#switching-between-code-and-test)
  - [Kotlin Tests](#kotlin-tests)

## Getting Started

Using this video https://www.youtube.com/watch?v=QDFI19lj4OM

Right click on a class and choose `generate...tests`

Generate a new test using Alt+Insert

Create your code, for example

```java
package com.example.helloworld;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class INeedToBeTestedTest {

    @org.junit.jupiter.api.Test
    void IAmAMethod() {
    }

    @Test
    void shouldTestMyCodeProperly() {
        // arrange
        var expected = 100;
        // act
        var actual = INeedToBeTested.IAmAMethod(100);
        // assert
        assertEquals(expected,actual);
        Assert.assertEquals(expected,actual);
    }
}
```

which tests this class

```java
package com.example.helloworld;
public class INeedToBeTested {
    public static int IAmAMethod(int x){
        return x;
    }
}
```

Click on the green arrow in the code and run the test!

We can also run in from the navigation bar

Also run with `Control Shift F10` or `Control Shift R` on MAC

We can add setup and teardown methods

```java
package com.example.helloworld;

import org.junit.Assert;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class INeedToBeTestedTest {

    @org.junit.jupiter.api.Test
    void IAmAMethod() {
    }

    @BeforeAll
    static void beforeAll() {

    }
    
    @BeforeEach
    void setUp() {
        
    }

    @Test
    void shouldTestMyCodeProperly() {
        // arrange
        var expected = 100;
        // act
        var actual = INeedToBeTested.IAmAMethod(100);
        // assert
        assertEquals(expected,actual);
        Assert.assertEquals(expected,actual);
    }

    @AfterEach
    void tearDown() {
        
    }

    @AfterAll
    static void afterAll() {
        
    }
}
```

### Switching between code and test

Use `Control Shift T` to switch between code and tests!

## Kotlin Tests

Right click on a class and choose `Generate -> Tests`

```kotlin


```