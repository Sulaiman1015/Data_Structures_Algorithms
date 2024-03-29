package Leetcode;

public class RemoveDuplicates {

    //remove sorted linked list elements
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
    public ListNode deleteDuplicates1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p1 = head;
        ListNode p2;
        while ((p2 = p1.next) != null){
            if (p1.val == p2.val){
                p1.next= p2.next;
            } else {
                p1 = p1.next;
            }
        }
        return head;
    }

    //solution 2
    public ListNode deleteDuplicates2(ListNode p) {
        if (p == null || p.next == null) {
            return p;
        }
        if (p.val == p.next.val) {
            return deleteDuplicates2(p.next);
        } else {
            p.next = deleteDuplicates2(p.next);
            return p;
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
        ListNode head = ListNode.of(1,1,2,3,3,6);
        printList(head);
        printList(new RemoveDuplicates().deleteDuplicates1(head));
        printList(new RemoveDuplicates().deleteDuplicates2(head));
    }
}
