package com.dsa.general;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PrintRandomIntegerList {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> integers = new ArrayList<>();

        int size = 10;
        int max = 100;
        int min = 1;

        for(int i = 0; i < size; i++) {
            int randomNum = random.nextInt(max - min + 1) + min;
            integers.add(randomNum);
        }
        System.out.println(integers);
    }
}
