package com.dsa.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumIndicesExample {
    public static void main(String[] args) {
        int[] nums = new int[] {2,5,7,6,8};
        int target = 11;
        printArrayHelper(findTwoSumIndicesWithoutMap(nums, target));
    }

    public static int[] findTwoSumIndicesWithMap(int[] arrs, int target) {
        if(arrs.length <= 1 || target == 0) System.out.println("Not a valid number");

        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arrs.length; i++) {
            int complement = target - arrs[i];
            if (hashMap.containsKey(complement)) {
                return new int[] {hashMap.get(complement), i};
            }
            hashMap.put(arrs[i], i);
        }
        return new int[]{-1};
    }

    public static int[] findTwoSumIndicesWithoutMap(int[] arrs, int target) {
        if(arrs.length <= 1 || target == 0) System.out.println("Not a valid number");
        int[] result = new int[]{};
        for (int i = 0; i < arrs.length; i++) {
            for (int j = i + 1; j < arrs.length; j++) {
                if (arrs[i] + arrs[j] == target) {
                    result = new int[] {i, j};
                }
            }
        }
        return result;
    }

    public static void printArrayHelper(int[] arrs) {
        System.out.print("[");
        for(int i = 0; i < arrs.length; i++) {
            System.out.print(arrs[i]);
            if (i < arrs.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
