package multi_recursion;

public class PascalTriangle {

    public static int triangle(int i, int j) {
        if (i == j || j == 0) {
            return 1;
        }
        return triangle(i-1, j-1) + triangle(i-1, j);
    }

    public static void print(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j <= i ; j++) {
                System.out.print(triangle(i,j));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //int v = triangle(4, 2);
        print(5);
    }
}
