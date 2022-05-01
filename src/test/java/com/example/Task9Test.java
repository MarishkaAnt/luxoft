package com.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.stream.Stream;

public class Task9Test {

    @ParameterizedTest
    @MethodSource("source")
    public void test_applyBackspaces_equals(String input, String expect) {
        Assertions.assertEquals(expect, Task9.applyBackspaces(input));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "     "})
    void isBlank_ShouldReturnTrueForBlankStrings(String input) {
        Assertions.assertEquals("", Task9.applyBackspaces(input));
    }

    @ParameterizedTest
    @NullSource
    void isNull_ShouldReturnTrueForNull(String input){
        Assertions.assertEquals("", Task9.applyBackspaces(input));
    }

    private static Stream<Arguments> source() {
        return Stream.of(
                Arguments.of("jn?y??bd", "bd"),
                Arguments.of("jkn????h??", ""),
                Arguments.of("hgj", "hgj"),
                Arguments.of("f", "f")
        );
    }

}
