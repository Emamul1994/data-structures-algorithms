package com.dsa.linkedlist;

public class PalindromeLinkedListExample {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        boolean isPalindrome = checkPalindrome(head);
        System.out.println(isPalindrome);
    }

    public static boolean checkPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHalfStart = reverseLinkedList(slow);

        ListNode firstHalfStart = head;
        //ListNode secondHalfCopy = secondHalfStart;

        while(secondHalfStart != null) {
            if(firstHalfStart.val != secondHalfStart.val){
                return false;
            } else {
                firstHalfStart = firstHalfStart.next;
                secondHalfStart = secondHalfStart.next;
            }

        }
        return true;
    }

    private static ListNode reverseLinkedList(ListNode root) {
        ListNode result = null;
        while (root != null) {
            ListNode temp = root.next;
            root.next = result;
            result = root;
            root = temp;
        }
        return result;
    }
}
