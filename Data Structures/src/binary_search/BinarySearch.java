package binary_search;

public class BinarySearch {
    //Params: 'a' is Ascending Order Array，
    //Params: target is a element in Array.
    public static int binarySearchBasic(int[] a, int target){
        int i = 0; //index
        int j = a.length - 1;
        while (i <= j){
            //int m = (i+j)/2;
            int m = (i+j) >>> 1;
            if(target < a[m]){
                j = m - 1; //target index on left of m
            } else if(target > a[m]){
                i = m + 1; //target index on right of m
            } else {
                return m; //find index of target
            }
        }
        return -1;
    }

    public static int binarySearchDiff1(int[] a, int target){
        int i = 0; //index
        int j = a.length;
        while (i < j){
            int m = (i+j) >>> 1;
            if(target < a[m]){
                j = m; //target index on left of m
            } else if(target > a[m]){
                i = m + 1; //target index on right of m
            } else {
                return m; //find index of target
            }
        }
        return -1;
    }

    public static int binarySearchDiff2(int[] a, int target){
        int i = 0, j = a.length;
        while (j-i > 1){
            int m = (i+j) >>> 1 ;
            if (target < a[m]){
                j = m;
            } else {
                i = m;
            }
        }
        if (a[i] == target){
            return i;
        } else {
            return -1;
        }

    }
}
