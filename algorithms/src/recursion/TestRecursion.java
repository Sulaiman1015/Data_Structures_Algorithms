package recursion;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static recursion.BinarySearch.search;
import static recursion.BubbleSort.bubble;
import static recursion.Fibonacci.fibonacci;
import static recursion.InsertionSort.sort1;
import static recursion.InsertionSort.sort2;

public class TestRecursion {
    @Test
    public void testBinarySearch() {
        int[] a = {7, 13, 21, 30, 38, 44, 52, 57};
        assertEquals(0, search(a, 7));
        assertEquals(3, search(a, 30));
        assertEquals(7, search(a, 57));
    }

    @Test
    public void testBubbleSort() {
        int[] a = {7, 3, 1, 5, 8, 4, 2, 6};
        bubble(a,a.length-1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8}, a);
    }

    @Test
    public void testInsertionSort1(){
       int[] expected = {1,2,3,4,5};
       int[] a1 = {5,4,3,2,1};
       sort1(a1);
       System.out.print(Arrays.toString(a1));
       assertArrayEquals(expected,a1);
       System.out.println("\n*************");
       int[] a2 = {1,4,2,5,3};
       sort1(a2);
       System.out.print(Arrays.toString(a2));
       assertArrayEquals(expected,a2);
    }

    @Test
    public void testInsertionSort2(){
        int[] expected = {1,2,3,4,5};
        int[] a1 = {5,4,3,2,1};
        sort2(a1);
        System.out.print(Arrays.toString(a1));
        assertArrayEquals(expected,a1);
        System.out.println("\n*************");
        int[] a2 = {1,4,2,5,3};
        sort2(a2);
        System.out.print(Arrays.toString(a2));
        assertArrayEquals(expected,a2);
    }

    @Test
    public void testFibonacci() {
        assertEquals(1, fibonacci(2));
        assertEquals(2, fibonacci(3));
        assertEquals(3, fibonacci(4));
        assertEquals(5, fibonacci(5));
    }
}
