package com.dsa.linkedlist;

public class DoublyLinkedList {
    class Node {
        int element;
        Node next;
        Node prev;

        public Node(int element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
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
        Node newest = new Node(element, null, null);
        if (isEmpty()) {
            head = newest;
            tail = newest;
        } else {
            tail.next = newest;
            newest.prev = tail;
            tail = newest;
        }
        size = size + 1;
    }

    public void addFirst(int element) {
        Node newest = new Node(element, null, null);
        if (isEmpty()) {
            head = newest;
            tail = newest;
        } else {
            newest.next = head;
            head.prev = newest;
            head = newest;
        }
        size = size + 1;
    }

    public void addAny(int element, int position) {
        if (position <= 0 || position >= size) {
            System.out.println("Invalid position");
            return;
        }
        Node newest = new Node(element, null, null);
        Node p = head;
        int i = 1;

        while (i < position - 1) {
            p = p.next;
            i++;
        }
        newest.next = p.next;
        p.next.prev = newest;
        p.next = newest;
        newest.prev = p;
        size = size + 1;
    }

    public int removeFirst() {
        int element = 0;
        if (isEmpty()) {
            System.out.println("List is empty");
            return -1;
        } else {
            Node p = head;
            element = p.element;
            head = head.next;
            size = size - 1;
            if (isEmpty()) {
                tail = null;
            } else {
                head.prev = null;
            }
        }
        return element;
    }

    public int removeLast() {
        int element = 0;
        if (isEmpty()) {
            System.out.println("List is empty");
            return -1;
        } else {
            element = tail.element;
            tail = tail.prev;
            tail.next = null;
            size = size - 1;
        }

        return element;
    }

    public int removeAny(int position) {
        int element = 0;
        if(position <= 0 || position >= size) {
            System.out.println("Invalid position");
        }
        Node p = head;
        int i = 1;
        while (i < position - 1) {
            p = p.next;
            i++;
        }
        element = p.next.element;
        p.next = p.next.next;
        p.next.prev = p;
        size = size - 1;
        return element;
    }

    public void display() {
        Node p = head;
        while (p != null) {
            System.out.print(p.element + " ");
            p = p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList dls = new DoublyLinkedList();
        dls.addLast(10);
        dls.addLast(12);
        dls.addLast(11);
        dls.addLast(9);
        dls.addFirst(20);
        dls.addAny(15, 3);
        //System.out.println(dls.removeFirst());
        //System.out.println(dls.removeLast());
        //System.out.println(dls.removeAny(4));
        dls.display();
        System.out.println("Size: " + dls.length());
    }
}
