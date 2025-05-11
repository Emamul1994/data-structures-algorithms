package com.dsa.search;

public class LinearSearchAlgorithmsDemo {

    public int linearSearch(int[] a, int n, int key) {
        int index = 0;
        while(index < n) {
            if (a[index] == key) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public static void main(String[] args) {
        LinearSearchAlgorithmsDemo ln = new LinearSearchAlgorithmsDemo();
        int[] arr = {21,45,32,87,29,56};
        int key = 87;
        int result = ln.linearSearch(arr, arr.length, key);
        System.out.println(result);
    }
}
