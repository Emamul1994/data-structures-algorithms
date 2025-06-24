package com.dsa.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateArray {
    public static void main(String[] args) {

        int[] input = {2,4,5,2,1,2,4,7,9,3,4};
        //System.out.println(Arrays.toString(removeDuplicateElement(input)));
        System.out.println(duplicateChecker(input));
    }

    public static boolean duplicateChecker(int[] arrs) {
        Set<Integer> set = new HashSet<>();
        for (int num : arrs) {
            if(!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static int[] removeDuplicateElement(int[] arrs) {
        return Arrays.stream(arrs).distinct().toArray();
    }
}
