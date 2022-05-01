package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Task5Test {

    @ParameterizedTest
    @MethodSource("source")
    public void test_findOutlier_true(String in, int expected) {
        List<Integer> input = Arrays.stream(in.split(" "))
                .map(Integer::parseInt)
                .toList();

        Assertions.assertEquals(expected, Task5.findOutlier(input));
    }

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of("3 6 7 11 13 1", 6),
                Arguments.of("4 3 2 6", 3),
                Arguments.of("4 10 3", 3),
                Arguments.of("5 4 3 5 13 7 11 1", 4)
        );
    }
}
