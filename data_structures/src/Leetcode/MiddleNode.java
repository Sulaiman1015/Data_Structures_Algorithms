package Leetcode;

import java.util.Arrays;
import java.util.Collections;

public class MiddleNode {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public static ListNode of(int... values) {
            ListNode dummy = new ListNode();
            ListNode p = dummy;
            for (int value : values) {
                p.next = new ListNode(value);
                p = p.next;
            }
            return dummy.next;
        }
    }

    //solution
    public ListNode findMiddleNode(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next;
            p2 = p2.next;
        }
        return p1;
    }

    public static void printList(ListNode head) {
        if (head == null) {
            System.out.println("[]");
            return;
        }

        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode p1 = ListNode.of(1,2,3,5,7);
        ListNode p2 = ListNode.of(2,3,4,4,5,6);

        printList(new MiddleNode().findMiddleNode(p1));
        printList(new MiddleNode().findMiddleNode(p2));
    }
}
