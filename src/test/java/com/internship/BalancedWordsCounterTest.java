package com.internship;

import org.junit.Assert;
import org.junit.Test;

public class BalancedWordsCounterTest {

    @Test
    public void threeLetterCorrectStringTest() {
        String input = "aabbabcccba";
        Integer expectedResult = 28;

        Integer result = new BalancedWordsCounter().count(input);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void emptyStringTest() {
        String input = "";
        Integer expectedResult = 0;

        Integer result = new BalancedWordsCounter().count(input);
        Assert.assertEquals(expectedResult, result);
    }

    @Test(expected = RuntimeException.class)
    public void incorrectStringTest() {
        String input = "abababa1";

        Integer result = new BalancedWordsCounter().count(input);
    }

    @Test(expected = RuntimeException.class)
    public void nullStringTest() {
        String input = null;

        Integer result = new BalancedWordsCounter().count(input);
    }
}