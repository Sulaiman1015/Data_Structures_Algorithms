package linked_list;

public class ReverseLinkedList2 {
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

    public ListNode reverseList(ListNode p) {
        if(p == null || p.next == null){
            return p;
        }
        ListNode last = reverseList(p.next);
        p.next.next = p;
        p.next = null;
        return last;
    }

    public static void printList(ReverseLinkedList2.ListNode head) {
        ReverseLinkedList2.ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReverseLinkedList2.ListNode n5 =new ReverseLinkedList2.ListNode(5, null);
        ReverseLinkedList2.ListNode n4 =new ReverseLinkedList2.ListNode(4, n5);
        ReverseLinkedList2.ListNode n3 =new ReverseLinkedList2.ListNode(3, n4);
        ReverseLinkedList2.ListNode n2 =new ReverseLinkedList2.ListNode(2, n3);
        ReverseLinkedList2.ListNode n1 =new ReverseLinkedList2.ListNode(1, n2);

        printList(n1);
        ListNode o1 = new ReverseLinkedList2().reverseList(n1);
        printList(o1);
    }
}
