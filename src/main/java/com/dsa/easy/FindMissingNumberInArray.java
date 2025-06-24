package com.dsa.easy;

public class FindMissingNumberInArray {
    public static void main(String[] args) {
        int[] input = {1,2,3,4,5,6};
        missingNumber(input);
    }

    public static void missingNumber(int[] nums) {
        int n = nums.length + 1;
        int expected = n * (n + 1) / 2;
        int actual = 0;
        for (int num : nums) {
            actual += num;
        }
        int result = expected - actual;
        System.out.println(result);
    }
}
