package com.dsa.easy;

public class ReverseString {
    public static void main(String[] args) {
        String input = "Emamul";
        reverseStringWithoutBuilInMethod(input);
    }

    public static void reverseStringWithBuilInMethod(String str) {
        StringBuilder reverseString = new StringBuilder(str).reverse();
        System.out.println(reverseString);
    }

    public static void reverseStringWithoutBuilInMethod(String str) {

        char[] ch = str.toCharArray();
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
    }
}
