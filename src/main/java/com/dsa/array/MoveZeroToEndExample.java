package com.dsa.array;

import java.util.Arrays;

public class MoveZeroToEndExample {
    public static void main(String[] args) {
        int[] arrs = {1, 2, 0, 4, 3, 0, 5, 0};
        System.out.println("Original: " + Arrays.toString(arrs));
        int[] movedArrays = pushAllZeroToStart(arrs);
        System.out.println("After Moved: " + Arrays.toString(movedArrays));
        //Arrays.sort(arrs);
        //System.out.println("Moved: " + Arrays.toString(arrs));
    }

    public static int[] pushAllZeroToStart(int[] arrs) {
        int length = arrs.length;
        int[] temp = new int[length];
        int j = length - 1;
        for (int i = j; i >= 0; i--) {
            if(arrs[i] != 0) {
                temp[j--] = arrs[i];
            }
        }

        while (j >= 0) {
            temp[j--] = 0;
        }
        for (int i = 0; i < length; i++) {
            arrs[i] = temp[i];
        }
        return arrs;
    }

    public static int[] pushAllZeroToEnd(int[] arrs) {
        int length = arrs.length;
        int[] temp = new int[length];

        int j = 0;
        for (int i = 0; i < length; i++) {
            if(arrs[i] != 0) {
                temp[j++] = arrs[i];
            }
        }
        while (j < length) {
            temp[j++] = 0;
        }
        for (int i = 0; i < length; i++) {
            arrs[i] = temp[i];
        }
        return arrs;
    }
}
