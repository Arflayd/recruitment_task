package com.internship;

import java.util.HashMap;
import java.util.HashSet;

public class BalancedWordsCounter {

    public Integer count(String input) {
        if (input == null) throw new RuntimeException("Input is null");
        if (!input.matches("[a-z]*"))
            throw new RuntimeException("Input contains characters other than lowercase letters");

        Integer counter = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length() + 1; j++) {
                String substring = input.substring(i, j);
                if (isBalanced(substring))
                    counter++;
            }
        }

        return counter;
    }

    public Boolean isBalanced(String input) {
        HashMap<Character, Integer> charCounter = new HashMap<>();
        for (Character character : input.toCharArray()) {
            charCounter.putIfAbsent(character, 0);
            charCounter.compute(character, (k, v) -> v + 1);
        }
        return new HashSet<>(charCounter.values()).size() == 1;
    }
}
