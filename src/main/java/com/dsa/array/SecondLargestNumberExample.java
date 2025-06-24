package com.dsa.array;

import java.util.Arrays;

public class SecondLargestNumberExample {

    public static int findSecondLargestElement(int[] numbers) {

        int length = numbers.length;
        Arrays.sort(numbers);

        for(int i = length - 2; i >= 0 ; i--) {
            if(numbers[i] != numbers[length - 1]) {
                return numbers[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 35, 1, 10, 34, 1, 40};
        /*int secondLargestElement = findSecondLargestElement(numbers);
        System.out.println(secondLargestElement);*/
        int length = numbers.length;
        Arrays.sort(numbers);
        System.out.println(numbers[length - 2]);

    }
}
