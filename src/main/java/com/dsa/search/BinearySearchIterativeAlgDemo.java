package com.dsa.search;

import java.util.Arrays;

public class BinearySearchIterativeAlgDemo {

    public int binearySearch(Integer[] a, int length, int key) {
        int left = 0;
        int right = length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (key == a[mid]) {
                return mid;
            } else if (key < a[mid]) {
                right = mid - 1;
            } else if (key > a[mid]) {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinearySearchIterativeAlgDemo bs = new BinearySearchIterativeAlgDemo();
        Integer[] arr = {21,45,32,78,90,30,54};
        Arrays.sort(arr);
        int key = 90;
        int result = bs.binearySearch(arr, arr.length, key);
        System.out.println("Index Result: " + result);
    }
}
