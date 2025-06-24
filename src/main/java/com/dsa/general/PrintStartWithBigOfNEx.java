package com.dsa.general;

public class PrintStartWithBigOfNEx {
    public static void main(String[] args) {

        int number = 8;
        printStartNumberUsingWhileLoop(number);
    }

    public static void printStartNumberUsingWhileLoop(int number) {
        StringBuilder line = new StringBuilder();
        int position = 1;
        while (position <= number) {
            line.append("*");
            System.out.println(line);
            position++;
        }
    }

    public static void printStartNumberUsingForLoop(int number) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < number; i++) {
            builder.append("*");
            System.out.println(builder);
        }
    }
}
