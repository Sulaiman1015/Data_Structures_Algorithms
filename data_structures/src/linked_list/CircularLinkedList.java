package linked_list;

import java.util.Iterator;

public class CircularLinkedList implements Iterable<Integer>{
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node p = sentinel.next;
            @Override
            public boolean hasNext() {
                return p != sentinel;
            }

            @Override
            public Integer next() {
                int value = p.value;
                p = p.next;
                return value;
            }
        };
    }

    private static class Node {
        Node prev;
        Node next;
        int value;

        public Node(Node prev, Node next, int value) {
            this.prev = prev;
            this.next = next;
            this.value = value;
        }
    }

    private Node sentinel = new Node(null, null, 808);

     public CircularLinkedList() {
         sentinel.prev = sentinel;
         sentinel.next = sentinel;
     }

     public void addFirst(int value) {
         Node a = sentinel;
         Node b = sentinel.next;
         Node node = new Node(a, b, value);
         a.next = node;
         b.prev = node;
     }

     public void addLast(int value) {
         Node b = sentinel;
         Node a = sentinel.prev;
         Node node = new Node(a, b, value);
         a.next = node;
         b.prev = node;
     }

     public void remove(int value) {
         Node node = findNode(value);
         Node a = node.prev;
         Node b = node.next;
         a.next = b;
         b.prev = a;
     }

     public Node findNode(int value) {
         Node p = sentinel.next;
         while (p != sentinel) {
             if (p.value == value) {
                 return p;
             }
             p = p.next;
         }
         return null;
     }
}
