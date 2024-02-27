package linked_list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSinglyLinkedList {


    SinglyLinkedList list = new SinglyLinkedList();
    @Test
    public void test1(){
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        list.loop1(System.out::print);
        System.out.println("\n*************");
        list.loop2(System.out::print);

    }

    @Test
    public void test2(){
        list.addFirst(6);
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        for(int value: list){
            System.out.println(value);
        }
        //list.forEach(System.out::println);

    }
    @Test
    public void test3(){
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.forEach(System.out::print);
        System.out.println("\n*************");

        list.addLast(6);
        list.forEach(System.out::print);

    }

    @Test
    public void test4(){
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);

        System.out.println(list.getValue(2));

        assertEquals(3, list.getValue(2));

    }

    @Test
    public void test5(){
        list.addLast(1);
        list.addLast(2);

        list.addLast(4);
        list.addLast(5);

        list.insert(2, 3);
        list.insert(5, 6);

        assertEquals(3, list.getValue(2));
        assertEquals(6, list.getValue(5));
        list.forEach(System.out::println);
    }

    @Test
    public void test6(){
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.insert(5,6);
        list.forEach(System.out::print);
        list.remove(0);
        System.out.println("\n***********");
        list.forEach(System.out::print);
    }

}
