package com.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class Task3Test {
    @Test
    public void test_getSums_true() {
        List<Integer> input = Stream.of(4, 2, 1, 5).toList();
        List<Integer> expect = Stream.of(12, 8, 6, 5, 0).toList();
        assertEquals(expect, Task3.getSums(input));
    }

    @Test
    public void test_getSumsSameValues_true() {
        List<Integer> input = Stream.of(4, 4, 4, 4).toList();
        List<Integer> expect = Stream.of(16, 12, 8, 4, 0).toList();
        assertEquals(expect, Task3.getSums(input));
    }

    @Test
    public void test_getSumsIfEmptyInput_Zero() {
        Integer[] i = new Integer[0];
        List<Integer> input = new ArrayList<>(List.of(i));
        List<Integer> expect = new ArrayList<>(List.of(0));
        assertEquals(expect, Task3.getSums(input));
    }

}
