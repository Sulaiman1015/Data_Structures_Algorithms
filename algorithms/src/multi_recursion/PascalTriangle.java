package multi_recursion;

public class PascalTriangle {

    public static int triangle(int i, int j) {
        if (j == 0 || i == j) {
            return 1;
        }
        return triangle(i-1, j-1) + triangle(i-1, j);
    }

    public static void printElement(int n) {
        for (int i = 0; i < n; i++) {
            printSpace(n, i);
            for (int j = 0; j <= i ; j++) {
                System.out.printf("%-4d", triangle(i,j));
            }
            System.out.println();
        }
    }

    private static void printSpace(int n, int i) {
        int s = (n - 1 - i) * 2;
        for (int j = 0; j < s; j++) {
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        //int v = triangle(4, 2);
        printElement(5);
    }
}
