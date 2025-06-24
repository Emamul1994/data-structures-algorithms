package com.dsa.general;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterOddListAndSum {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,1,4,6,5,4,7,9);

        int sumOfOddNum = list.stream().filter(num -> num % 2 != 0).mapToInt(Integer::intValue).sum();
        System.out.println(sumOfOddNum);
    }
}
