package Leetcode;

public class RemoveFromEnd {

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
    public ListNode removeEnd(ListNode head, int n) {
        ListNode s = new ListNode(888, head);
        recursion(s, n);
        return s.next;
    }

    public int recursion(ListNode p, int n){
        if(p == null){
            return 0;
        }
        int nextNum = recursion(p.next, n);

        if( nextNum == n){
            p.next = p.next.next;
        }
        return nextNum+1;
    }

    //solution 2

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
        ListNode head = ListNode.of(1,2,3,4,5,6);
        //ListNode head = ListNode.of(1);
        printList(head);
        printList(new RemoveFromEnd().removeEnd(head, 6));

    }



}
