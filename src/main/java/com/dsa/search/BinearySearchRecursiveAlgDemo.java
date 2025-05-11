package com.dsa.search;

import java.util.Arrays;

public class BinearySearchRecursiveAlgDemo {

    public int binearySearch(Integer[] arr, int key, int left, int right) {
        if(left > right) {
            return -1;
        } else {
            int mid = (left + right) / 2;
            if(key == arr[mid]) {
                return mid;
            } else if (key < arr[mid]) {
                return binearySearch(arr, key, left, mid-1);
            } else if (key > arr[mid]) {
                return binearySearch(arr, key, mid+1, right);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        BinearySearchRecursiveAlgDemo bs = new BinearySearchRecursiveAlgDemo();
        Integer[] arr = {21,45,32,78,90,30,54};
        Arrays.sort(arr);
        int key = 90;
        int left = 0;
        int right = arr.length - 1;
        int result = bs.binearySearch(arr, key, left, right);
        System.out.println("Index Result: " + result);
    }
}
