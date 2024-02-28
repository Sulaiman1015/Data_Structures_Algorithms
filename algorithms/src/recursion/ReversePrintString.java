package recursion;

public class ReversePrintString {
    public static void f(int n, String str) {
        if (n == str.length()) {
            return;
        }
        f(n+1, str);
        System.out.print(str.charAt(n));
    }

    public static void main(String[] args) {
        f(0, "abcdef");
    }
}
