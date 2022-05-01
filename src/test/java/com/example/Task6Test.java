package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Task6Test {

    @ParameterizedTest
    @MethodSource("source")
    public void test_getResult_true(String in, int expected) {
        List<Integer> input = Arrays.stream(in.split(" "))
                .map(Integer::parseInt)
                .toList();

        Assertions.assertEquals(expected, Task6.getResult(input));
    }

    public static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of("1 5 3 1 2 1 1", 1),
                Arguments.of("4 4 4", 4),
                Arguments.of("3 3 10 3 8 4 3 3 6 8 3 6", 3),
                Arguments.of("5 4 7 7 5 7 4 7 7 6 7 6 7", 7)
        );
    }
}
