package com.dsa.easy;

import java.util.stream.IntStream;

public class FindMaxElementInArray {
    public static void main(String[] args) {
        int[] input = {2,1,4,5,9,8};
        //int maxElement = findMaxElement(input);
        int maxElement = IntStream.of(input).max().orElse(0);
        System.out.println(maxElement);
    }

    public static int findMaxElement(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            if(num > max) {
                max = num;
            }
        }
        return max;
    }
}
