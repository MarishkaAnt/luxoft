package com.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author MARIIA
 * You are given an array (which will have a length of at least 3) containing integers.
 * The array is either entirely composed of odd integers
 * or entirely composed of even integers except for a single integer N.
 * Write a method that takes the array as an argument and returns this "outlier" N.
 * In the input: numbers - list of integers
 * At the output: number
 * Example:
 * [3, 6, 7, 11, 13, 1] -->  6
 */

public class Task5 {

    public static int findOutlier(List<Integer> numbers) {
        Map<Boolean, List<Integer>> response = numbers.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        List<Integer> evens = response.get(true);
        List<Integer> odds = response.get(false);
        if (evens.size() == 1) {
            return evens.get(0);
        } else {
            return odds.get(0);
        }
    }

    public static void main(String[] args) {
        System.out.println(findOutlier(Stream.of(3, 6, 7, 11, 13, 1).toList()));
    }
}
