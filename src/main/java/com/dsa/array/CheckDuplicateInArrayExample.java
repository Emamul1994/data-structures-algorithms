package com.dsa.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckDuplicateInArrayExample {
    public static void main(String[] args) {
        int[] arrs = {1,2,3,1};
        //System.out.println(checkDuplicateWithoutSet(arrs));
        System.out.println(checkDuplicateWithSet(arrs));
    }

    public static boolean checkDuplicateWithoutSet(int[] arrs) {
        Arrays.sort(arrs);
        for (int i = 1; i < arrs.length; i++) {
            if(arrs[i] == arrs[i - 1]) {
                return true;
            }
        }
        return false;
    }
    public static boolean checkDuplicateWithSet(int[] arrs) {
        Set<Integer> duplicateSeen = new HashSet<>();
        for (int i = 0; i < arrs.length; i++) {
            if (duplicateSeen.contains(arrs[i])) {
                return true;
            }
            duplicateSeen.add(arrs[i]);
        }
        return false;
    }
}
