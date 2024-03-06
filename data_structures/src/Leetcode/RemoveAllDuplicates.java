package Leetcode;

public class RemoveAllDuplicates {

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
        ListNode s = new ListNode(-1,head);
        ListNode p1 = s;
        ListNode p2, p3;
        while ((p2 = p1.next) != null && (p3 = p2.next) != null){

            if (p2.val == p3.val){
                while (p3 != null && p3.val == p2.val){
                    p3 = p3.next;
                }
                p1.next = p3;
            } else {
                p1 = p1.next;
            }
        }
        return s.next;
    }

    //solution 2
    public ListNode deleteDuplicates2(ListNode p) {
        if (p == null || p.next == null) {
            return p;
        }
        if (p.val == p.next.val) {
            ListNode x = p.next.next;
            while (x != null && x.val == p.val) {
                x = x.next;
            }
            return deleteDuplicates2(x);
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
        ListNode head = ListNode.of(1,1,2,3,3,3,6);
        printList(head);
        printList(new RemoveAllDuplicates().deleteDuplicates1(head));
        printList(new RemoveAllDuplicates().deleteDuplicates2(head));
    }
}
