package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class MergeMultiLinkedList {
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

    public ListNode mergeTwoList(ListNode p1, ListNode p2) {
        if (p1 == null) {
            return p2;
        }
        if (p2 == null) {
            return p1;
        }
        if (p1.val < p2.val) {
            p1.next = mergeTwoList(p1.next, p2);
            return p1;
        } else {
            p2.next = mergeTwoList(p1, p2.next);
            return p2;
        }
    }

    public ListNode mergeMultiList(ListNode[] lists) {
        if (lists.length == 0) {
            return null;
        }
        return split(lists,0, lists.length - 1);
    }

    public ListNode split(ListNode[] lists, int i, int j) {
        if (i == j){
            return lists[i];
        }
        int m = (i+j) >>> 1;
        ListNode left = split(lists, i, m);
        ListNode right = split(lists, m + 1, j);
        return mergeTwoList(left,right);
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
        ListNode[] lists = {
            ListNode.of(1, 2, 3),
            ListNode.of(0, 4, 6, 7),
            ListNode.of(3, 5, 7),
            ListNode.of(1, 2, 4, 5, 6)
        };
        printList(new MergeMultiLinkedList().mergeMultiList(lists));
    }
}
