package Leetcode;

public class PalindromeLinkedList {

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

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            ListNode current = this;
            sb.append("[");
            while (current != null) {
                sb.append(current.val);
                if (current.next != null) {
                    sb.append(", ");
                }
                current = current.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }
    public boolean isPalindrome(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        ListNode o1 = head;
        ListNode n1 = null;
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;


            o1.next = n1;
            n1 = o1;
            o1 = p1;
        }

        if (p2 != null) {
            p1 = p1.next;
        }

        while (n1 != null) {
            if (n1.val != p1.val) {
                return false;
            }
            n1 = n1.next;
            p1 = p1.next;
        }

        return true;
    }

    public static void main(String[] args) {
        ListNode p1 = ListNode.of(1,2,3,2,1);
        ListNode p2 = ListNode.of(2,3,4,4,3,2);
        System.out.println(p1);
        System.out.println("p1 is palindrome? "+new PalindromeLinkedList().isPalindrome(p1));
        System.out.println(p2);
        System.out.println("p2 is palindrome? "+new PalindromeLinkedList().isPalindrome(p2));;
    }
}
