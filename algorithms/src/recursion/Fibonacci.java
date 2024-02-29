package recursion;

import java.util.Arrays;

public class Fibonacci {

    public static int fibonacci(int n) {
        int[] cache = new int[n+1];
        Arrays.fill(cache,-1); //[-1,-1,-1,-1,-1,-1]
        cache[0] = 0;//[0,-1,-1,-1,-1,-1]
        cache[1] = 1;//[0,1,-1,-1,-1,-1]
        return f(n, cache);
    }
    public static int f(int n, int[] cache) {
        /*if(n == 0) {
            return 0;
        }
        if(n == 1){
            return 1;
        }*/
        if(cache[n] != -1){
            return cache[n];
        }

        int x = f(n-1, cache);
        int y = f(n-2, cache);
        cache[n] = x + y;
        return cache[n];
    }

}
