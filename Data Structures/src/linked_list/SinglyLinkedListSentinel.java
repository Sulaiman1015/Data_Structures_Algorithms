package linked_list;

import java.util.Iterator;
import java.util.function.Consumer;

public class SinglyLinkedListSentinel implements Iterable<Integer>{
    private Node head = new Node(1111, null); // node sentinel replace default head null

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node p = head.next;
            @Override
            public boolean hasNext() {
                return p != null;
            }

            @Override
            public Integer next() {
                int v = p.value;
                p = p.next;
                return v;
            }
        };
    }

    private static class Node {
        int value;
        Node next;

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void addFirst(int value) {
        //null linked list
        //head =  new Node(value, null);
        //not null linked list
        head = new Node(value, head);
    }

    private Node findLast() {

        Node p = head.next;
        while (p.next != null){
            p = p.next;
        }
        return p;
    }

    public void addLast(int value) {
        Node last = findLast();
        last.next = new Node(value, null);
    }

    private Node findNode(int index) {
        int i = -1;
        for(Node p = head.next; p != null; p = p.next, i++) {
            if (i == index) {
                return p;
            }
        }
        return null;
    }

    public int getValue(int index) {
        Node node = findNode(index);
        if(node == null) {
            throw new IllegalArgumentException(
                    String.format("index [%d] is illegal", index)
            );
        }
        return node.value;
    }

    public void insert(int index, int value) {

        Node prev = findNode(index - 1);
        if(prev == null) {
            throw new IllegalArgumentException(
                    String.format("index [%d] is illegal", index)
            );
        }
        prev.next = new Node(value, prev.next);
    }

    public void remove(int index){
        Node node = findNode(index);
        Node prev = findNode(index - 1);
        if(index == 0){
            head = head.next;
            return;
        }
        //Node after = findNode(index + 1);
        if(prev == null || node == null) {
            throw new IllegalArgumentException(
                    String.format("index [%d] is illegal", index)
            );
        }
        prev.next = node.next;

    }

    public void loop1(Consumer<Integer> c) {
        Node point = head.next;
        while (point != null) {
            c.accept(point.value);
            point = point.next;
        }
    }

    public void loop2(Consumer<Integer> c) {
        for(Node p = head.next; p != null; p = p.next){
            c.accept(p.value);
        }
    }
}


