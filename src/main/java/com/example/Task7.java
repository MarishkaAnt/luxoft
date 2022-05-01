package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author MARIIA
 * Given an array numbers of n integers where n > 1,
 * return an array output such that output[i] is
 * equal to the product of all the elements of numbers except numbers[i].
 * In the input: numbers - array of integers
 * At the output: array of integers
 * Example:
 * numbers = [3, 5, 1, 4]
 * getResult( numbers ) --> [20, 12, 60, 15]
 */

public class Task7 {
    public static List<Integer> getResult(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        if (numbers.stream().distinct().toList().size() == numbers.size()) {
            for (Integer n : numbers) {
                int reduce = numbers.stream()
                        .filter(i -> !i.equals(n))
                        .mapToInt(x -> x)
                        .reduce(1, Math::multiplyExact);
                result.add(reduce);
            }
        } else {
            for (Integer n : numbers) {
                int reduce = 1;
                for (int i = 0; i < numbers.indexOf(n); i++) {
                    reduce *= numbers.get(i);
                }
                for (int i = numbers.indexOf(n) + 1; i < numbers.size(); i++) {
                    reduce *= numbers.get(i);
                }
                result.add(reduce);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(getResult(Stream.of(3, 5, 1, 3).toList()));
    }
}
