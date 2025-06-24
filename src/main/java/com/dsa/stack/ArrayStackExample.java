package com.dsa.stack;

public class ArrayStackExample {

    int[] data;
    int top;

    public ArrayStackExample(int n) {
        data = new int[n];
        top = 0;
    }

    public int length() {
        return top;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public boolean isFull() {
        return top == data.length;
    }

    public void push(int element) {
        if(isFull()) {
            System.out.println("Stack is full/overflow....");
            return;
        } else {
            data[top] = element;
            top = top + 1;
        }
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty");
            return -1;
        }
        int element = data[top - 1];
        top = top - 1;
        return element;
    }

    public void display() {
        for (int i = 0; i < top; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ArrayStackExample stack = new ArrayStackExample(10);

        stack.push(3);
        stack.push(4);
        stack.push(1);

        stack.display();
        System.out.println("Is Empty: " + stack.isEmpty());
        System.out.println("Is Full:" + stack.isFull());

        stack.pop();
        stack.display();
    }
}
