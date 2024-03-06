package Leetcode;

public class MergeTwoLinkedList {
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

    //solution 1
    public ListNode mergeTwoList1(ListNode p1, ListNode p2) {
        ListNode s = new ListNode(-1,null);
        ListNode p = s;

        while (p1 != null && p2 != null){
            if (p1.val <= p2.val){
                p.next = p1;
                p1 = p1.next;
            } else {
                p.next = p2;
                p2 = p2.next;
            }
            p = p.next;
        }
        if (p1 != null) {
            p.next = p1;
        }
        if (p2 != null) {
            p.next = p2;
        }
        return s.next;
    }

    //solution 2
    public ListNode mergeTwoList2(ListNode p1, ListNode p2) {
        if (p1 == null) {
            return p2;
        }
        if (p2 == null) {
            return p1;
        }
        if (p1.val < p2.val) {
            p1.next = mergeTwoList2(p1.next, p2);
            return p1;
        } else {
            p2.next = mergeTwoList1(p1, p2.next);
            return p2;
        }
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
        ListNode p1 = ListNode.of(1,2,3,5);
        ListNode p2 = ListNode.of(2,3,4,4,5,6);

        printList(new MergeTwoLinkedList().mergeTwoList1(p1,p2));
        printList(new MergeTwoLinkedList().mergeTwoList2(p1,p2));
    }
}
