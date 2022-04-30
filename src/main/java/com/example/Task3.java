package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MARIIA
 * Let us consider this example (array written in general format):
 * numbers = [4, 2, 1, 5]
 * Its following parts:
 * numbers = [4, 2, 1, 5]
 * numbers = [2, 1, 5]
 * numbers = [1, 5]
 * numbers = [5]
 * numbers = []
 * <p>
 * The corresponding sums are (put together in a list): [12, 8, 6, 5, 0]
 * The function getSums will take as parameter a list numbers and return a list
 * of the sums of its parts as defined above.
 * <p>
 * In the input: numbers - list of integers
 * At the output: list of integers
 */

public class Task3 {

    public static List<Integer> getSums(List<Integer> numbers) {
        List<Integer> list = new ArrayList<>();
        List<Integer> result = recursion(numbers, list);
        result.add(0);
        return result;
    }

    private static List<Integer> recursion(List<Integer> numbers, List<Integer> list) {
        List<Integer> newList = new ArrayList<>(numbers);
        if (numbers.size() > 0) {
            list.add(newList.stream().mapToInt(n -> n).sum());
            newList.remove(0);
            recursion(newList, list);
        }
        return list;
    }
}
