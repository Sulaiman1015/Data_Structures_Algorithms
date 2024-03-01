package linked_list;

public class ReverseLinkedList1 {
    //singly linked list
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode ln = null;
        ListNode p = head;
        while ( p != null) {
            ln = new ListNode(p.val, ln);
            p = p.next;
        }
        return ln;

    }

    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode n5 =new ListNode(5, null);
        ListNode n4 =new ListNode(4, n5);
        ListNode n3 =new ListNode(3, n4);
        ListNode n2 =new ListNode(2, n3);
        ListNode n1 =new ListNode(1, n2);

        printList(n1);
        ListNode o1 = new ReverseLinkedList1().reverseList(n1);
        printList(o1);
    }
}
