package com.dsa.linkedlist;

public class RemoveNthElementFromNodeExample {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2;
        System.out.println("Before: " + ListNode.size());
        ListNode listNode = removeNthElement(head, n);
        printNode(listNode);
        System.out.println("After: " + ListNode.size());

    }
    public static ListNode removeNthElement(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        ListNode.size--;
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        ListNode.size--;
        return dummy.next;
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
