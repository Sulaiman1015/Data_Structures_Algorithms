package dynamic_array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

public class TestDynamicArray {
    DynamicArray da = new DynamicArray();

    @Test
    public void test1(){
        da.addLast(1);
        da.addLast(2);
        da.addLast(3);
        da.addLast(6);
        da.addLast(8);

        da.add(3, 4);
        da.add(4, 5);
        da.add(6, 7);

        /*for (int i = 0; i < 8; i++) {
            System.out.println(da.getElement(i));
        }*/

        /*da.forEach((element)->{
            System.out.println(element);
        });*/
        da.forEach(System.out::println);
        System.out.println(Arrays.toString(da.getArray()));
    }

    @Test
    public void test2(){

        for (Integer element: da) {
            System.out.println(element);
        }
    }

    @Test
    public void test3(){
        da.addLast(1);
        da.addLast(2);
        da.addLast(3);
        da.addLast(6);
        da.addLast(8);

        da.add(3, 4);
        da.add(4, 5);
        da.add(6, 7);

        /*da.stream().forEach(element ->{
            System.out.println(element);
        });*/
        da.stream().forEach(System.out::println);
    }

    @Test
    public void test4(){
        da.addLast(1);//0
        da.addLast(2);//1
        da.addLast(3);//2
        da.add(3, 4);//3
        da.add(4, 5);//4
        da.addLast(6);//5

        System.out.println("Before: "+Arrays.toString(da.getArray()));
        int removed = da.remove(3);
        assertEquals(4, removed);
        assertIterableEquals(List.of(1,2,3,5,6), da);
        System.out.println("After: "+Arrays.toString(da.getArray()));

    }
}
