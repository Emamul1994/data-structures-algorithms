package com.dsa.recursive;

public class ReverseLinkedListExample {

    public static ListNode getReverseLinkedList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode tempVal = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tempVal;
        }
        return prev;
    }

    public static void printReverseList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.println("Original Linked List");
        printReverseList(head);
        System.out.println("reverse linked list");
        ListNode reverseLinkedList = getReverseLinkedList(head);
        printReverseList(reverseLinkedList);
    }
}
