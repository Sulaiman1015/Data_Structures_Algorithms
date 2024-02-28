package recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void sort(int[] a) {
        bubble(a,a.length-1);
    }

    public static void bubble(int[] a, int j) {
        if (j == 0) {
            return;
        }
        int x = 0;
        for (int i = 0; i < j; i++){
            if(a[i] > a[i+1]){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
                x = i;
            }
        }
        bubble(a,x);
    }

    public static void main(String[] args) {
        int[] a = {7, 3, 1, 5, 8, 4, 2, 6};
        bubble(a,a.length-1);
        System.out.println(Arrays.toString(a));
    }
}
