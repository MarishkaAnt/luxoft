package com.example;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author MARIIA
 * When Joe gets up to work in the morning, he gets tired of finding socks without a pair.
 * He numbered all of his socks and wrote a program that brings out the position of a sock
 * that does not have a pair. Now Joe always has matching socks and more free time.
 * Input: socks - an array of numbers that always has one unpaired number
 * Output: integer - the value of a number without a pair in array
 * Example:
 * socks = [2, 3, 5, 3, 1, 2, 1]
 * getResult (socks) -> 5
 */

public class Task4 {
    public static int getResult(List<Integer> socks) {
        Map<Integer, Long> numbersOfSocks = socks.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        int result = 0;
        for (Map.Entry<Integer, Long> e : numbersOfSocks.entrySet()) {
            if (e.getValue() == 1) {
                result = e.getKey();
            }
        }
        return result;
    }

}
