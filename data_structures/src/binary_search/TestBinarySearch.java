package binary_search;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBinarySearch {
    @Test
    @DisplayName("binary_search.BinarySearch Found")
    public void test1(){
        int[] a = {9, 13, 25, 31, 39, 44, 52, 67};
        assertEquals(0, BinarySearch.binarySearchBasic(a, 9));
        assertEquals(1, BinarySearch.binarySearchBasic(a, 13));
        assertEquals(2, BinarySearch.binarySearchBasic(a, 25));
        assertEquals(3, BinarySearch.binarySearchBasic(a, 31));
        assertEquals(4, BinarySearch.binarySearchBasic(a, 39));
        assertEquals(5, BinarySearch.binarySearchBasic(a, 44));
        assertEquals(6, BinarySearch.binarySearchBasic(a, 52));
        assertEquals(7, BinarySearch.binarySearchBasic(a, 67));
    }

    @Test
    @DisplayName("binary_search.BinarySearch Not Found")
    public void test2(){
        int[] a = {9, 13, 25, 31, 39, 44, 52, 67};
        assertEquals(-1, BinarySearch.binarySearchBasic(a, 7));
        assertEquals(-1, BinarySearch.binarySearchBasic(a, 11));
        assertEquals(-1, BinarySearch.binarySearchBasic(a, 24));

    }

    @Test
    @DisplayName("binary_search.BinarySearch Found")
    public void test3(){
        int[] a = {9, 13, 25, 31, 39, 44, 52, 67};
        assertEquals(0, BinarySearch.binarySearchDiff1(a, 9));
        assertEquals(1, BinarySearch.binarySearchDiff1(a, 13));
        assertEquals(2, BinarySearch.binarySearchDiff1(a, 25));
        assertEquals(3, BinarySearch.binarySearchDiff1(a, 31));
        assertEquals(4, BinarySearch.binarySearchDiff1(a, 39));
        assertEquals(5, BinarySearch.binarySearchDiff1(a, 44));
        assertEquals(6, BinarySearch.binarySearchDiff1(a, 52));
        assertEquals(7, BinarySearch.binarySearchDiff1(a, 67));
    }

    @Test
    @DisplayName("binary_search.BinarySearch Not Found")
    public void test4(){
        int[] a = {9, 13, 25, 31, 39, 44, 52, 67};
        assertEquals(-1, BinarySearch.binarySearchDiff1(a, 7));
        assertEquals(-1, BinarySearch.binarySearchDiff1(a, 11));
        assertEquals(-1, BinarySearch.binarySearchDiff1(a, 24));

    }

    @Test
    @DisplayName("binary_search.BinarySearch Found")
    public void test5(){
        int[] a = {9, 13, 25, 31, 39, 44, 52, 67};
        assertEquals(0, BinarySearch.binarySearchDiff2(a, 9));
        assertEquals(1, BinarySearch.binarySearchDiff2(a, 13));
        assertEquals(2, BinarySearch.binarySearchDiff2(a, 25));
        assertEquals(3, BinarySearch.binarySearchDiff2(a, 31));
        assertEquals(4, BinarySearch.binarySearchDiff2(a, 39));
        assertEquals(5, BinarySearch.binarySearchDiff2(a, 44));
        assertEquals(6, BinarySearch.binarySearchDiff2(a, 52));
        assertEquals(7, BinarySearch.binarySearchDiff2(a, 67));
    }

    @Test
    @DisplayName("binary_search.BinarySearch Not Found")
    public void test6(){
        int[] a = {9, 13, 25, 31, 39, 44, 52, 67};
        assertEquals(-1, BinarySearch.binarySearchDiff2(a, 7));
        assertEquals(-1, BinarySearch.binarySearchDiff2(a, 11));
        assertEquals(-1, BinarySearch.binarySearchDiff2(a, 24));

    }

    @Test
    @DisplayName("binary_search.BinarySearch Found")
    public void test7(){
        int[] a = {2, 3, 6, 6, 6, 9, 11, 17};
        assertEquals(0, SearchMost.findLeftMost(a, 2));
        assertEquals(1, SearchMost.findLeftMost(a, 3));
        assertEquals(2, SearchMost.findLeftMost(a, 6));

        assertEquals(5, SearchMost.findLeftMost(a, 9));
        assertEquals(6, SearchMost.findLeftMost(a, 11));
        assertEquals(7, SearchMost.findLeftMost(a, 17));
    }

    @Test
    @DisplayName("binary_search.BinarySearch Not Found")
    public void test8(){
        int[] a = {2, 3, 6, 6, 6, 9, 11, 17};
        assertEquals(-1, SearchMost.findLeftMost(a, 4));
        assertEquals(-1, SearchMost.findLeftMost(a, 12));
        assertEquals(-1, SearchMost.findLeftMost(a, 19));
    }

    @Test
    @DisplayName("binary_search.BinarySearch Found")
    public void test9(){
        int[] a = {2, 3, 6, 6, 6, 9, 11, 17};
        assertEquals(0, SearchMost.findRightMost(a, 2));
        assertEquals(1, SearchMost.findRightMost(a, 3));
        assertEquals(4, SearchMost.findRightMost(a, 6));

        assertEquals(5, SearchMost.findRightMost(a, 9));
        assertEquals(6, SearchMost.findRightMost(a, 11));
        assertEquals(7, SearchMost.findRightMost(a, 17));
    }

    @Test
    @DisplayName("binary_search.BinarySearch Not Found")
    public void test10(){
        int[] a = {2, 3, 6, 6, 6, 9, 11, 17};
        assertEquals(-1, SearchMost.findLeftMost(a, 4));
        assertEquals(-1, SearchMost.findLeftMost(a, 12));
        assertEquals(-1, SearchMost.findLeftMost(a, 19));
    }

}