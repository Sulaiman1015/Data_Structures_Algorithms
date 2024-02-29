package recursion;

public class RecurSum {
    /*public static long sumTailRecursion(long n, long accumulator) {
        if (n == 1) {
            return accumulator + 1;
        }
        return sumTailRecursion(n-1, accumulator+n);
    }

    public static long sum(long n) {
        return sumTailRecursion(n, 0);
    }


    public static void main(String[] args) {
        System.out.println(sum(15000));
    }*/


    //StackOverFlowError if n=15000
    // Tail call, tail recursion
    //this solution not work for java using tail recursive
    public static long sum(long n, long currentSum) {
        if (n == 1) {
            return currentSum + 1;
        }
        return sum(n - 1, currentSum + n);
    }

    public static void main(String[] args) {
        System.out.println(sum(15000, 0)); // Initialize currentSum to 0
    }

}
