package com.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author MARIIA
 * You should sort elements in an array by decreasing frequency of elements.
 * If two elements have the same frequency, sort them by increasing value.
 * In the input:
 * arr - list of numbers
 * At the output: sorted list of numbers
 * Example:
 * input: [4, 10, 3, 6, 4, 4, 8, 8, 6]
 * output: [4, 4, 4, 6, 6, 8, 8, 3, 10]
 */
public class Task2 {
    public static List<Integer> frequencySort(List<Integer> arr) {
        Map<Integer, Long> map = arr.stream()
                .collect(Collectors.groupingBy(k -> k, Collectors.counting()));

        Comparator<List<Integer>> listComparator =
                (e1, e2) -> e2.size() - e1.size();

        List<List<Integer>> list = new ArrayList<>();
        for (Map.Entry<Integer, Long> e: map.entrySet()){
            List<Integer> l = new ArrayList<>();
            for (int i = 0; i < e.getValue(); i++) {
                l.add(e.getKey());
            }
            list.add(l);
        }
        return list.stream().sorted(listComparator)
                .flatMap(Collection::stream).collect(Collectors.toList());
    }

}
