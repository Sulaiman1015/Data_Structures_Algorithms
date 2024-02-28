package binary_search;

public class SearchMost {
    public static int findLeftMost(int[] a, int target){
        int i = 0, j = a.length - 1;
        int s = -1; //save element index for left most
        while (i <= j){
            int m = (i + j) >>> 1;
            if (target < a[m]){
                j = m - 1;
            } else if(target > a[m]){
                i = m + 1;
            } else { // target = a[m]
                s = m; //save target index/position
                j = m - 1;
            }
        }
        return s;
    }

    public static int findRightMost(int[] a, int target){
        int i = 0, j = a.length - 1;
        int s = -1;
        while (i <= j){
            int m = (i + j) >>> 1;
            if (target < a[m]){
                j = m - 1;
            } else if (target > a[m]) {
                i = m + 1;
            } else {
                s = m;
                i = m + 1;
            }
        }
        return s;
    }
}
