package linked_list;

import java.util.Iterator;

public class DoubleLinkedListSentinel implements Iterable<Integer> {

    static class Node {
        Node prev;
        Node next;
        int value;

        public Node(Node prev, Node next, int value) {
            this.prev = prev;
            this.next = next;
            this.value = value;
        }
    }

    private Node head;
    private Node tail;

    public DoubleLinkedListSentinel() {
        head = new Node(null,null, 111);
        tail = new Node(null, null, 999);
        head.next = tail;
        tail.next = head;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node p = head.next;
            @Override
            public boolean hasNext() {
                return p != tail;
            }

            @Override
            public Integer next() {
                int v = p.value;
                p = p.next;
                return v;
            }
        };
    }

    private Node findNode(int index) {
        int i = -1;
        for (Node p = head; p != tail; p = p.next, i++) {
            if (i == index) {
                return p;
            }
        }
        return null;
    }

    public void insert(int index, int value) {
        Node prev = findNode(index - 1);
        if(prev == null) {
            throw new IllegalArgumentException(
                    String.format("index [%d] is illegal", index)
            );
        }
        Node next = prev.next;
        Node node = new Node(prev,next,value);
        prev.next = node;
        next.prev = node;
    }

    public void addFirst(int value) {
        insert(0, value);
    }

    public void addLast(int value) {
        Node last = tail.prev;
        Node node = new Node(last, last.next, value);
        last.next = node;
        node.prev = last;
        node.next = tail;
        tail.prev = node;
    }

    public void remove(int index) {
        Node prev = findNode(index - 1);
        Node next = findNode(index + 1);
        if(prev == null || next == null) {
            throw new IllegalArgumentException(
                    String.format("index [%d] is illegal", index)
            );
        }
        prev.next = next;
        next.prev = prev;
    }
}
