package com.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author MARIIA
 * Given an array of size n, find the majority element.
 * The majority element is the element that appears more than n/2 times.
 * You may assume that the array is non-empty and the majority element always exist in the array.
 * In the input:
 * numbers -  array of intgers
 * At the output: integer
 * Example:
 * numbers = [3,1,3]
 * getResult( numbers ) --> 3
 */

public class Task6 {
    public static int getResult(List<Integer> numbers) {
        Map<Integer, Long> collect = numbers.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        int result = 0;
        for (Map.Entry<Integer, Long> e : collect.entrySet()) {
            if (e.getValue() >= numbers.size() / 2) {
                result = e.getKey();
            }
        }
        return result;
    }

}
