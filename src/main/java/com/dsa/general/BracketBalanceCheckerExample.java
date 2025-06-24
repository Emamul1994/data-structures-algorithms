package com.dsa.general;

import java.util.*;

public class BracketBalanceCheckerExample {
    public static void main(String[] args) {
        List<String> brackets = Arrays.asList(
                "[(){()}]",
                "[](){[]}",
                "[({}(]",
                "[){})]",
                "[{(})]"
        );

        for (String str : brackets) {
            System.out.println(isBalanced(str) ? "Balanced" : "Unbalanced");
        }
    }
    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> bracketsPair = Map.of(
                ')' , '(',
                '}' , '{',
                ']' , '['
        );

        for (char ch : input.toCharArray()) {
            if (bracketsPair.containsValue(ch)) {
                stack.push(ch);
            } else if (bracketsPair.containsKey(ch)) {
                if (stack.isEmpty() || stack.pop() != bracketsPair.get(ch)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
