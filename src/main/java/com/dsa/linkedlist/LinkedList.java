package com.dsa.linkedlist;

public class LinkedList {
    class Node {
        int element;
        Node next;
        public Node(int element, Node next) {
            this.element = element;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;
    public LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    public int length() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public void addLast(int element) {
        Node newest = new Node(element, null);
        if (isEmpty()) {
            head = newest;
        } else {
            tail.next = newest;
        }
        tail = newest;
        size = size + 1;
    }

    public void addFirst(int element) {
        Node newest = new Node(element, null);
        if (isEmpty()) {
            head = newest;
            tail = newest;
        } else {
            newest.next = head;
            head = newest;
        }
        size = size + 1;
    }

    public void addAny(int element, int position) {
        Node newest = new Node(element, null);
        if (position <= 0 || position >= size) {
            System.out.println("Not a valid position");
            return;
        }

        Node p = head;
        int i = 1;
        while (i < position - 1) {
            p = p.next;
            i = i + 1;
        }
        newest.next = p.next;
        p.next = newest;
        size = size + 1;
    }

    public int removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            int element = head.element;
            head = head.next;
            size = size - 1;
            if (isEmpty()) {
                tail = null;
            }
            return element;
        }
        return -1;
    }

    public int removeLast() {
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            Node p = head;
            int i = 1;
            while (i < length() - 1) {
                p = p.next;
                i++;
            }
            tail = p;
            p = p.next;
            int element = p.element;
            tail.next = null;
            size = size - 1;
            return element;
        }
        return -1;
    }

    public int removeAny(int position) {
        if (size <= 0 || position >= size - 1) {
            System.out.println("Can't be remove");
        } else {
            Node p = head;
            int i = 1;
            while (i < position - 1) {
                p = p.next;
                i++;
            }
            int element = p.next.element;
            p.next = p.next.next;
            size = size - 1;
            return element;
        }
        return -1;
    }

    public int search(int key) {
        Node p = head;
        int index = 0;
        while (p != null) {
            if(p.element == key) {
                return index;
            }
            p = p.next;
            index++;
        }
        return -1;
    }

    public void display() {
        Node p = head;
        System.out.print("[");
        while (p != null) {
            System.out.print(p.element + " ");
            p = p.next;
        }
        System.out.print("]");
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList ls = new LinkedList();
        ls.addLast(4);
        ls.addLast(12);
        ls.display();
        System.out.println("Size: " + ls.length());
        ls.addLast(41);
        ls.addLast(42);
        ls.addFirst(5);
        ls.addAny(10, 1);
        ls.display();
        System.out.println("Size: " + ls.length());
        System.out.println(ls.removeFirst());
        System.out.println("Size: " + ls.length());
        ls.display();
        System.out.println(ls.removeLast());
        System.out.println("Size: " + ls.length());
        ls.display();
        System.out.println(ls.removeAny(2));
        System.out.println("Size: " + ls.length());
        ls.display();
        int position = ls.search(121);
        System.out.println("12 Position index: [0,1,2,3,4,5....n] = " + position);
    }
}
