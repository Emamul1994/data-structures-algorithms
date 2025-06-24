package com.dsa.easy;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicateFromLinkedList {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(12, 11, 12, 21, 41, 43, 21));
        Set<Integer> hashSet = new HashSet<>();

        linkedList.stream().distinct().sorted().forEach(System.out::println);
    }
}
