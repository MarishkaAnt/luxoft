package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Task7Test {

    @ParameterizedTest
    @MethodSource("source")
    public void test_getResult_true(String in, String exp) {
        List<Integer> input = Arrays.stream(in.split(" "))
                .map(Integer::parseInt)
                .toList();
        List<Integer> expected = Arrays.stream(exp.split(" "))
                .map(Integer::parseInt)
                .toList();

        Assertions.assertEquals(expected, Task7.getResult(input));
    }

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of("2 3 5", "15 10 6"),
                Arguments.of("4 4", "4 4"),
                Arguments.of("4 10 3 8", "240 96 320 120"),
                Arguments.of("4 4 4 4", "64 64 64 64"),
                Arguments.of("5 4 3 5", "60 75 100 60")
        );
    }
}
