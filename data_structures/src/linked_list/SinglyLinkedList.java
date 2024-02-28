package linked_list;

import java.util.Iterator;
import java.util.function.Consumer;

public class SinglyLinkedList implements Iterable<Integer>{
    private Node head; // default head = null

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            Node p = head;
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
        if (head == null)
            return null;

        Node p = head;
        while (p.next != null){
            p = p.next;
        }
        return p;
    }

    public void addLast(int value) {
        Node last = findLast();
        if( last == null){
            addFirst(value);
        } else {
            last.next = new Node(value, null);
        }
    }

    private Node findNode(int index) {
        int i = 0;
        for(Node p = head; p != null; p = p.next, i++) {
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
        if(index == 0){
            addFirst(value);
            return;
        }

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
        Node point = head;
        while (point != null) {
            c.accept(point.value);
            point = point.next;
        }
    }

    public void loop2(Consumer<Integer> c) {
        for(Node p = head; p != null; p = p.next){
            c.accept(p.value);
        }
    }

    public void loop3(Consumer<Integer> before, Consumer<Integer> after) {
        recursion(head,before,after);
    }

    public void recursion(Node current, Consumer<Integer> before, Consumer<Integer> after) {
        if(current == null) {
            return;
        }
        before.accept(current.value);
        recursion(current.next, before, after);
        after.accept(current.value);
    }
}


