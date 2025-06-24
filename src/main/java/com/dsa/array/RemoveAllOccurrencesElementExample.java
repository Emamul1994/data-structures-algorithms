package com.dsa.array;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RemoveAllOccurrencesElementExample {
    public static void main(String[] args) {
        int[] arrs = {0, 1, 3, 0, 2, 2, 4, 2};
        List<Integer> list = IntStream.of(arrs).mapToObj(num -> (int) num).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(list);

        Optional<Integer> first = IntStream.of(arrs).mapToObj(num -> (int) num).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
        System.out.println(first);
    }
}
