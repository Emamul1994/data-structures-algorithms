package com.dsa.linkedlist;

import java.util.stream.IntStream;

public class StringPalindromeExample {
    public static void main(String[] args) {
        String str = "madam";
        checkPalindromeUsingStream(str);
    }
    public static void checkPalindromeWithoutStream(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                System.out.println("Not a palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("Palindrome");
    }

    public static void checkPalindromeUsingStream(String str) {
        boolean isPalindrome = IntStream.range(0, str.length() / 2).allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));
        System.out.println(isPalindrome);
    }
}
