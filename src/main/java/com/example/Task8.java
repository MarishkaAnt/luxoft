package com.example;

import java.util.Comparator;
import java.util.List;

/**
 * @author MARIIA
 * Find the n-th-largest element in an unsorted array.
 * Note that it is the n-th-largest element in the sorted order,
 * not the n-th distinct element.
 * In the input: numbers - array of integers, n - integer, 1 ≤ n ≤ array's length.
 * At the output: integer
 * Example:
 * numbers = [5,7,4,3,7,8,6]
 * n = 3
 * getResult( numbers, n ) --> 7
 */

public class Task8 {
    public static int getResult(List<Integer> numbers, int n) {
        List<Integer> collect = numbers.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        return collect.get(n - 1);
    }

}