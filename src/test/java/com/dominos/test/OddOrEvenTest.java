package com.dominos.test;

/*
Given A string
When I call is even function
Then I evaluate if the string length is even or odd
Note: A null or empty string should be evaluated as odd
 */

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OddOrEvenTest {

    private OddOrEven oddOrEven = new OddOrEven();

    @Test
    @DisplayName("Evaluate is even length string")
    void shouldValidateIsEven(){
        assertTrue(oddOrEven.isEven("wolf"));
    }

    @Test
    @DisplayName("Evaluate is odd length string")
    void shouldValidateIsOdd(){
        assertFalse(oddOrEven.isEven("fox"));
    }

    @Test
    @DisplayName("Evaluate is odd when null")
    void shouldValidateIsOddWhenNull(){
        assertFalse(oddOrEven.isEven(null));
    }

    @Test
    @DisplayName("Evaluate is odd when empty string")
    void shouldValidateIsOddWhenEmpty(){
        assertFalse(oddOrEven.isEven(""));
    }
}
