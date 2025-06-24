package com.dsa.recursive;

public class FindMiddleOfListExample {

    public static ListNode findMiddleListNode(ListNode head) {
        if (head == null) return null;
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
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
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        System.out.println("Original List");
        printList(head);
        ListNode middleListNode = findMiddleListNode(head);
        System.out.println("Middle val: " + middleListNode.val);
    }
}
