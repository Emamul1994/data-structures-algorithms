package com.dsa.array;

public class MaximumSubArrayExample {
    public static void main(String[] args) {
        int[] numbers = {-2, 1, -3, 4, -1, 2, 2, -5, 4};
        System.out.println(maxSubArray(numbers));
    }
    public static int maxSubArray(int[] numbers) {
        if (numbers == null || numbers.length == 0) throw new RuntimeException("Array is Empty");

        int maxEndingHere = numbers[0];
        int maxSoFar = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            maxEndingHere = Math.max(numbers[i], maxEndingHere + numbers[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }

}
