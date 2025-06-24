package com.dsa.array;

import java.util.Arrays;

public class ThirdLargestNumberExample {

    public static void main(String[] args) {
        int[] numbers = {1, 14, 2, 16, 10, 20};
        int length = numbers.length;
        int thirdNum = findThirdNumWithoutSortSingle(numbers, length);
        System.out.println(thirdNum);
    }

    public static int findThirdNumWithoutSortSingle(int[] numbers, int length) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i = 0; i < length; i++) {
            if (numbers[i] > first) {
                third = second;
                second = first;
                first = numbers[i];
            } else if (numbers[i] > second) {
                third = second;
                second = numbers[i];
            } else if (numbers[i] > third) {
                third = numbers[i];
            }
        }
        return third;
    }

    public static int findThirdNumWithoutSort(int[] numbers, int length) {
        int first = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            if(numbers[i] > first) {
                first = numbers[i];
            }
        }

        int second = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            if (numbers[i] > second && numbers[i] < first) {
                second = numbers[i];
            }
        }

        int third = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            if (numbers[i] > third && numbers[i] < second) {
                third = numbers[i];
            }
        }
        return third;
    }
    public static void findThirdNumWithSort(int[] numbers, int length) {
        Arrays.sort(numbers);
        int thirdNum = numbers[length - 3];
        System.out.println(thirdNum);
    }
}
