package Leetcode;

import java.util.List;

public class RemoveLinkedListElements {
    //remove linked list elements
    public static class ListNode {

        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        public static ListNode of(int... values) {
            ListNode dummy = new ListNode();
            ListNode current = dummy;
            for (int val : values) {
                current.next = new ListNode(val);
                current = current.next;
            }
            return dummy.next;
        }

    }

    //solution 1
    public ListNode removeElements(ListNode head, int val) {
        ListNode s = new ListNode(888, head);
        ListNode p1 = s;
        ListNode p2 = s.next;
        while (p2 != null){
            if (p2.val == val){
                p1.next = p2.next;
                p2 = p2.next;
            } else {
                p1 = p1.next;
                p2 = p2.next;
            }
        }
        return s.next;
    }

    //solution 2 using recursion
    public ListNode recursRemoveElements(ListNode head, int val) {
        if (head == null){
            return null;
        }
        if (head.val == val){
            return recursRemoveElements(head.next,val);
        } else {
            head.next = recursRemoveElements(head.next, val);
            return head;
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
        ListNode head = ListNode.of(1,2,6,3,6);
        ListNode head1 = ListNode.of(6,6,6,6,6);
        printList(head);
        //printList(new RemoveLinkedListElements().removeElements(head, 6));
        printList(new RemoveLinkedListElements().recursRemoveElements(head, 6));
        System.out.println("*******************");
        printList(head1);
        //printList(new RemoveLinkedListElements().removeElements(head1, 6));
        printList(new RemoveLinkedListElements().recursRemoveElements(head1, 6));
    }

}
