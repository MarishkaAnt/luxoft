package com.example;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetOrderTesting {
    public static void main(String[] args) {
        Set<Integer> ints = new ConcurrentSkipListSet<>();
        ints.add(5);
        ints.add(60);
        ints.add(48);
        ints.add(30);
        ints.add(22);
        ints.add(1);
        ints.add(0);
        System.out.println(ints);
        // HashSet = [48, 0, 1, 5, 22, 60, 30]
        // TreeSet, ConcurrentSkipListSet = [0, 1, 5, 22, 30, 48, 60]
        // LinkedHashSet, CopyOnWriteArraySet = [5, 60, 48, 30, 22, 1, 0]
    }
}
