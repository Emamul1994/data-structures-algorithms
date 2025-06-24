package com.dsa.easy;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReverseLinkedList {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>(Arrays.asList(12, 11, 12, 21, 41, 43, 21));
        reverseWithStream(linkedList);

    }
    public static void reverseWithoutStream(List<Integer> linkedList) {
        int left = 0;
        int right = linkedList.size() - 1;
        System.out.println(linkedList);
        while (left < right) {
            int temp = linkedList.get(left);
            linkedList.set(left, linkedList.get(right));
            linkedList.set(right, temp);

            left++;
            right--;
        }
        System.out.println(linkedList);
    }
    public static void reverseWithStream(List<Integer> linkedList) {
        List<Integer> reverseList = IntStream.range(0, linkedList.size())
                .mapToObj(i -> linkedList.get(linkedList.size() - 1 - i))
                .collect(Collectors.toList());

        System.out.println(reverseList);
    }
}
