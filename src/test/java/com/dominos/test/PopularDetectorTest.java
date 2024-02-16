package com.dominos.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PopularDetectorTest {

    private com.test.popular.PopularDetector popularDetector = new com.test.popular.PopularDetector();

    @Test
    @DisplayName("should get most popular number")
    void shouldGetBiggestNumberFromThreePairs(){
        //34,31,34,56,12,35,24,34,69,18
        List<Integer> numbers = null;
        assertEquals(34, popularDetector.find(numbers));
    }

    @Test
    @DisplayName("should get biggest number")
    void shouldGetBiggestNumberFromFivePairs(){
        //2,5,3,2,6,2
        List<Integer> numbers = null;
        assertEquals(2, popularDetector.find(numbers));
    }
}
