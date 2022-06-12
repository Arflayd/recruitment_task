package com.internship;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class BubbleSortTest {

    @Test
    public void positiveIntegerNonNullSortTest(){
        List<Integer> input = List.of(1,4,5,6,8,3,8);
        List<Integer> expectedResult = List.of(1,3,4,5,6,8,8);

        List<?> result = new BubbleSort().sort(input);
        assertEquals(expectedResult, result);
    }

    @Test
    public void mixedSignDoubleNonNullSortTest(){
        List<Double> input = List.of(-9.3,0.2,4.0,0.1,5.0,9.0);
        List<Double> expectedResult = List.of(-9.3,0.1,0.2,4.0,5.0,9.0);

        List<?> result = new BubbleSort().sort(input);
        assertEquals(expectedResult, result);
    }

    @Test
    public void emptyDoubleListSortTest(){
        List<Double> input = Collections.emptyList();
        List<Double> expectedResult = Collections.emptyList();

        List<?> result = new BubbleSort().sort(input);
        assertEquals(expectedResult, result);
    }

    @Test
    public void doubleWithNullSortTest(){
        List<Double> input = new ArrayList<>();
        input.add(null);
        input.add(5.0001);
        List<Double> expectedResult = List.of(5.0001);

        List<?> result = new BubbleSort().sort(input);
        assertEquals(expectedResult, result);
    }

    @Test(expected = RuntimeException.class)
    public void nullListSortTest(){
        List<Double> input = null;

        List<?> result = new BubbleSort().sort(input);
    }

}