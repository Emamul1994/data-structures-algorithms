package com.dsa.easy;

public class PalindromeCheckerExample {
    public static void main(String[] args) {
        String str = "madam";
        boolean polindrom = isPolindrom(str);
        System.out.println(polindrom);
    }

    public static boolean isPolindrom(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if(str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}
