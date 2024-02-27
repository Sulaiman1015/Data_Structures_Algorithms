package linked_list;

import org.junit.jupiter.api.Test;

public class TestDoubleLinkedList {
    DoubleLinkedListSentinel list = new DoubleLinkedListSentinel();

    @Test
    public void test1(){
        list.addFirst(2);
        list.addFirst(1);
        list.insert(2,3);
        list.addLast(4);
        list.addLast(5);

        list.forEach(System.out::print);
        list.remove(2);
        list.remove(0);
        System.out.println("\n********");
        list.forEach(System.out::print);
    }
}
