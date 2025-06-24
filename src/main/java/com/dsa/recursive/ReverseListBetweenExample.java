package com.dsa.recursive;

public class ReverseListBetweenExample {

    public static ListNode reverseBetweenPosition(ListNode head, int left, int right) {
        if (head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }
        ListNode start = prev.next;
        ListNode then = start.next;

        for (int i = 0; i < right - left; i++) {
            start.next = then.next;
            then.next = prev.next;
            prev.next = then;
            then = start.next;
        }
        return dummy.next;
    }

    public static ListNode reverseBetweenValue(ListNode head, int leftVal, int rightVal) {
        if (head == null) return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        while (prev.next != null && prev.next.val != leftVal) {
            prev = prev.next;
        }

        if(prev.next == null) {
            System.out.println("Left value not found");
            return head;
        }

        ListNode start = prev.next;
        ListNode end = start;

        while (end.next != null && end.val != rightVal) {
            end = end.next;
        }

        if (end == null) {
            System.out.println("Right value not found");
            return head;
        }

        ListNode after = end.next;
        ListNode curr = start;
        ListNode prevReverse = after;

        while (curr != after) {
            ListNode temp = curr.next;
            curr.next = prevReverse;
            prevReverse = curr;
            curr = temp;
        }
        prev.next = prevReverse;
        return dummy.next;
    }
    public static void printList(ListNode head) {
        ListNode curr = head;
        if (head == null) return;

        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(10);
        head.next.next = new ListNode(4);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next = new ListNode(5);

        System.out.println("Original linked list");
        printList(head);

        int left = 10, right = 6;
        //ListNode reversedListNode = reverseBetweenPosition(head, left, right);
        ListNode reverseBetweenValue = reverseBetweenValue(head, left, right);
        printList(reverseBetweenValue);
    }
}
