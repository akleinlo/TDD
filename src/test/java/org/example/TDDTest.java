package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TDDTest {

    // Unit Tests
    // ----------------------------------------------------------------------------
    // ----------------------------------  1  -------------------------------------
    // ----------------------------------------------------------------------------

    // Aufgaben Java Basics – Unit Test Exercises
    // ----- Level 1: Easy ----

    @Test
    void isEven_shouldReturnTrue_whenCalledWith2() {
        // GIVEN --> Werte, die wir kennen
        int number = 2;
        boolean expected = true;

        // WHEN --> Aufruf der Methode
        boolean actual = TDD.isEven(number);

        // THEN --> Vergleich von Erwartung und Realität
        assertEquals(expected, actual);
    }

    @Test
    void isPositive_shouldReturnTrue_whenCalledWith1() {
        // GIVEN
        int number = 1;
        boolean expected = true;
        //WHEN
        boolean actual = TDD.isPositive(number);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void multiply_shouldReturnProduct_whenCalledWithTwoIntegers() {
        // GIVEN
        int a = 3;
        int b = 5;
        int expected = a * b;
        // WHEN
        int result = TDD.multiply(a, b);
        //THEN
        assertEquals(expected, result);
    }

    // ----- Level 2: Medium ----

    @Test
    void getFirstLetter_shouldReturnTrueOrNull_whenCalledWithAOrEmptyString() {
        // GIVEN
        String a = "Theodor";
        String b = "";
        String expectedA = "T";
        String expectedB = null;

        // WHEN
        String actualA = TDD.getFirstLetter(a);
        String actualB = TDD.getFirstLetter(b);

        // THEN
        assertEquals(expectedA, actualA);
        assertEquals(expectedB, actualB);
        assertNull(actualB);
    }

    @Test
    void getFirstLetter_shouldReturnFirstLetter_whenCalledWithNonEmptyString() {
        // GIVEN
        String name = "Theodor";

        // WHEN
        String firstLetter = TDD.getFirstLetter(name);

        // THEN
        assertEquals("T", firstLetter);
        assertNotNull(firstLetter); // zusätzlicher Check
    }

    @Test
    void getFirstLetter_shouldReturnNull_whenCalledWithEmptyString() {
        // GIVEN
        String empty = "";

        // WHEN
        String result = TDD.getFirstLetter(empty);

        // THEN
        assertNull(result);
    }

    @Test
    void getFirstLetter_shouldReturnNull_whenCalledWithNull() {
        // GIVEN
        String nullString = null;

        // WHEN
        String result = TDD.getFirstLetter(nullString);

        // THEN
        assertNull(result);
    }

    @Test
    void divide_shouldReturn3_whenCalledWith9And3() {
        // GIVEN
        int a = 9;
        int b = 3;
        double expected = 3.0;

        // WHEN
        double result = TDD.divide(a, b);

        // THEN
        assertEquals(expected, result);
    }

    @Test
    void divide_shouldThrowIllegalArgumentException_whenDividingByZero() {
        // GIVEN
        int a = 3;
        int b = 0;

        // THEN
        assertThrows(IllegalArgumentException.class, () -> TDD.divide(a, b));
    }

    // ----- Level 3: Bonus ----
    @Test
    void isPrime_shouldReturnTrue_whenCalledWith13() {
        // GIVEN
        int a = 13;
        boolean expected = true;
        // WHEN
        boolean actual = TDD.isPrime(a);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void isPrime_shouldReturnFalse_whenCalledWith12() {
        // GIVEN
        int a = 12;
        boolean expected = false;
        // WHEN
        boolean actual = TDD.isPrime(a);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void isPrime_shouldReturnFalse_whenCalledWith0() {
        // GIVEN
        int a = 0;
        boolean expected = false;
        // WHEN
        boolean actual = TDD.isPrime(a);
        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void isPrime_shouldReturnFalse_whenCalledWithNegativeNumber() {
        // GIVEN
        int a = -3;
        boolean expected = false;
        // WHEN
        boolean actual = TDD.isPrime(a);
        // THEN
        assertEquals(expected, actual);
    }

    // TDD
    // ----------------------------------------------------------------------------
    // ----------------------------------  2  -------------------------------------
    // ----------------------------------------------------------------------------

    // Aufgaben Java Basics – Test-Driven Development (TDD)
    // ----- Level 1: Easy ----

    @Test
    void sum_shouldReturnTrue_whenSumOf2And4Equals6() {
        // GIVEN
        int a = 2;
        int b = 4;
        int expected = 6;

        // WHEN
        int actual = TDD.sum(a, b);

        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void isEven_shouldReturnTrue_whenNumberIs4() {
        // GIVEN
        int a = 4;
        boolean expected = true;

        // WHEN
        boolean actual = TDD.isEven(a);

        // THEN
        assertTrue(actual);
    }

    @Test
    void getFirstCharacter_shouldReturnFirstChar_whenStringIsNotEmptyOrNull() {
        // GIVEN
        String name = "Adrian";

        // WHEN
        char actual = TDD.getFirstCharacter(name);

        // THEN
        assertEquals('A', actual);
    }

    @Test
    void getFirstCharacter_shouldReturnThrowException_whenStringIsNull() {
        // GIVEN
        String nullString = null;
        // THEN
        assertThrows(IllegalArgumentException.class, () -> TDD.getFirstCharacter(nullString));
    }

    @Test
    void getFirstCharacter_shouldReturnThrowException_whenStringIsBlank() {
        assertThrows(IllegalArgumentException.class, () -> TDD.getFirstCharacter(""));
    }

    @Test
    void getFirstCharacter_shouldReturnThrowException_whenTextOnlyHasBlankSpaces() {
        assertThrows(IllegalArgumentException.class, () -> TDD.getFirstCharacter("   "));
    }

    // ----- Level 2: Medium ----
    @Test
    void reverseString_shouldReturnReversedString_whenStringIsNotNullOrEmpty() {
        // GIVEN
        String input = "Java";
        String expected = "avaJ";

        // WHEN
        String actual = TDD.reverseString(input);

        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void isPalindrome_shouldReturnTrue_whenStringIsAnna() {
        // GIVEN
        String text = "Anna";
        boolean expected = true;

        // WHEN
        boolean actual = TDD.isPalindrome(text);

        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void isPalindrome_shouldReturnFalse_whenStringIsPeter() {
        // GIVEN
        String text = "Peter";
        // WHEN
        boolean actual = TDD.isPalindrome(text);
        // THEN
        assertFalse(actual);
    }

    @Test
    void countVowels_shouldReturn3_whenStringIsAnanas() {
        // GIVEN
        String text = "Ananas";
        int expected = 3;

        // WHEN
        int actual = TDD.countVowels(text);

        // THEN
        assertEquals(expected, actual);
    }

    // ----- Level 3: Bonus ----
    @Test
    void factorial_shouldReturn120_whenIntIs5() {
        // GIVEN
        int a = 5;
        int expected = 120;

        // WHEN
        int actual = TDD.factorial(5);

        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void fibonacci_shouldReturn13_whenIntIs7() {
        // GIVEN
        int a = 7;
        int expected = 13;

        // WHEN
        int actual = TDD.fibonacci(a);

        // THEN
        assertEquals(expected, actual);
    }

    @Test
    void mergeArrays_shouldReturnConcatenatedArrays_whenTwoIntArraysAreGiven() {
        // GIVEN
        int[] a = {1, 2};
        int[] b = {3, 4};
        int[] expected = {1, 2, 3, 4};

        // WHEN
        int[] actual = TDD.mergeArrays(a, b);

        // THEN
        assertArrayEquals(expected, actual);
    }

}