package com.dsa.linkedlist;

public class ListNode {
    int val;
    static int size = 0;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
        size = size + 1;
    }
    public static int size() {
        return size;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public static void printNode(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
