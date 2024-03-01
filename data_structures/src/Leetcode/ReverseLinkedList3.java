package Leetcode;

public class ReverseLinkedList3 {
    //singly linked list
    public static class ListNode {
        static ListNode head;
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }


    }

    public ListNode reverseList(ListNode head) {
        ListNode nl = null;
        while ( head != null){
            ListNode headNext = head.next;
            head.next = nl;
            nl = head;
            head = headNext;
        }
        return nl;
    }

    public static void printList(ReverseLinkedList3.ListNode head) {
        ReverseLinkedList3.ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLinkedList3.ListNode n5 =new ReverseLinkedList3.ListNode(5, null);
        ReverseLinkedList3.ListNode n4 =new ReverseLinkedList3.ListNode(4, n5);
        ReverseLinkedList3.ListNode n3 =new ReverseLinkedList3.ListNode(3, n4);
        ReverseLinkedList3.ListNode n2 =new ReverseLinkedList3.ListNode(2, n3);
        ReverseLinkedList3.ListNode n1 =new ReverseLinkedList3.ListNode(1, n2);

        printList(n1);
        ListNode o1 = new ReverseLinkedList3().reverseList(n1);
        printList(o1);
    }
}
