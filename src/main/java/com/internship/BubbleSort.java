package com.internship;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static java.util.stream.Collectors.toList;

public class BubbleSort {

    public <T extends Comparable<T>> List<T> sort(List<T> input) {
        if (input == null) throw new RuntimeException("Input is null");

        List<T> result = copyListExcludingNulls(input);
        int n = result.size();

        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (result.get(j).compareTo(result.get(j + 1)) > 0)
                    Collections.swap(result, j, j + 1);

        return result;
    }

    private <T extends Comparable<T>> List<T> copyListExcludingNulls(List<T> input) {
        return input.stream().filter(Objects::nonNull).collect(toList());
    }
}
