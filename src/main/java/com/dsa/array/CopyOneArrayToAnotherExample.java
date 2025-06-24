package com.dsa.array;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class CopyOneArrayToAnotherExample {
    public static void main(String[] args) {
        int[] original = new int[5];
        int[] copy = new int[5];
        int count = 2;
        for (int i = 0; i < original.length; i++) {
            original[i] = count;
            count++;
        }
        int index = 0;
        for (int val : original) {
            copy[index] = val;
            index++;
        }
        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(copy));
    }
}
