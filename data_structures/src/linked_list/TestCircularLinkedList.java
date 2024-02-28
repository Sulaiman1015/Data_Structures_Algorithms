package linked_list;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class TestCircularLinkedList {
    CircularLinkedList list = new CircularLinkedList();

    @Test
    public void test1(){
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(5);
        list.forEach(System.out::println);
        assertIterableEquals(List.of(1,2,3,4,5), list);
    }

    @Test
    public void test2(){
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(5);
        list.forEach(System.out::print);
        list.remove(5);
        list.remove(2);
        System.out.println("\n*********");
        list.forEach(System.out::print);
        assertIterableEquals(List.of(1,3,4), list);
    }
}
