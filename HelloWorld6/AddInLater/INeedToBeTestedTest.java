package uk.co.philanderson;

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