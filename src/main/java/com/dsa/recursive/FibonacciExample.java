package com.dsa.recursive;

import java.util.Arrays;

public class FibonacciExample {

    public static int fibRecursive(int num) {
        if(num <= 1) return num;
        return fibRecursive(num - 1) + fibRecursive(num - 2);
    }

    public static int fibRecMemo(int num) {
        int[] memo = new int[num + 1];
        Arrays.fill(memo, -1);
        return helper(7, memo);
    }

    public static int fibIterative(int num) {
        if (num == 0) return num;
        if (num == 1) return num;

        int prev1 = 1;
        int prev2 = 0;
        int result = 0;

        for(int i = 2; i <= num; i++) {
            result = prev1 + prev2;
            prev2 = prev1;
            prev1 = result;
        }
        return result;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println("Number: " + n);
        //int fibNumber = fibRecursive(n);
        //int fibNumber = fibRecursive(n);
        //int fibNumber = fibIterative(n);
        for (int i = 0; i <= 10; i++) {
            System.out.print(fibRecursive(i) + " ");
        }
        //System.out.println("Fibonacci: " + fibNumber);
    }

    private static int helper(int n, int[] memo) {
        if (n <= 1) return n;
        if (memo[n] != -1) return memo[n];
        return helper(n -1, memo) + helper(n-2, memo);
    }
}

