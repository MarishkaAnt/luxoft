package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Task8Test {

    @ParameterizedTest
    @MethodSource("source")
    public void test_getResult_true(String in, int n, int expected) {
        List<Integer> input = Arrays.stream(in.split(" "))
                .map(Integer::parseInt)
                .toList();

        Assertions.assertEquals(expected, Task8.getResult(input, n));
    }

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of("5 7 4 3 7 8 6", 3, 7),
                Arguments.of("15 7 13 4 13 7 8 6", 3, 13),
                Arguments.of("15 7 13 4 13 7 8 6", 6, 7),
                Arguments.of("7 7 7 7 7 7 7 7 7", 2, 7),
                Arguments.of("7 1", 2, 1),
                Arguments.of("15 7 13 4 13 7 8 6", 2, 13)
        );
    }
}
