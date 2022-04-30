package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Task2Test {


    @ParameterizedTest
    @MethodSource("source")
    public void test_frequencySort_true(String in, String exp) {
        List<Integer> input = Arrays.stream(in.split(" "))
                .map(Integer::parseInt)
                .toList();
        List<Integer> expected = Arrays.stream(exp.split(" "))
                .map(Integer::parseInt)
                .toList();
        Assertions.assertEquals(expected, Task2.frequencySort(input));
    }

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of("4 10 3", "3 4 10"),
                Arguments.of("4", "4"),
                Arguments.of("4 10 3 8 4 4 6 8 6", "4 4 4 6 6 8 8 3 10"),
                Arguments.of("5 4 3 5 4 6 6 6", "6 6 6 4 4 5 5 3")
        );

    }

}

