package recursion;

public class InsertionSort {
    public static void sort1(int[] a) {
        insertion1(a, 1);
    }

    public static void sort2(int[] a) {
        insertion2(a, 1);
    }

    private static void insertion1(int[] a, int low) {
        if(low == a.length){
            return;
        }
        int t = a[low];
        int i = low - 1;

        while (i >= 0 && a[i] > t) {
            a[i+1] = a[i];
            i--;
        }
        if (i+1 != low){
            a[i+1] = t;
        }

        insertion1(a,low+1);
    }

    private static void insertion2(int[] a, int low) {
        if(low == a.length){
            return;
        }

        int i = low - 1;

        while (i >= 0 && a[i] > a[i+1]) {
            int t = a[i];
            a[i] = a[i+1];
            a[i+1] = t;
            i--;
        }

        insertion2(a,low+1);
    }
}
