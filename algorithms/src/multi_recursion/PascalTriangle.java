package multi_recursion;

public class PascalTriangle {
    //****************//
    //two-dimensional array memoization
    public static int triangle(int[][] element, int i, int j) {
        if (element[i][j] > 0) {
            return element[i][j];
        }
        if (j == 0 || i == j) {
            element[i][j] = 1;
            return 1;
        }
        element[i][j] = triangle(element,i-1, j-1) + triangle(element,i-1, j);
        return element[i][j];
    }

    public static void printElement(int n) {
        int[][] element = new int[n][];
        for (int i = 0; i < n; i++) {
            element[i] = new int[i+1];
            printSpace(n, i);
            for (int j = 0; j <= i ; j++) {
                System.out.printf("%-4d", triangle(element, i, j));
            }
            System.out.println();
        }
    }




    //****************//
    //One-dimensional array memoization
    public static void createRow(int[] row, int i) {
        if(i == 0){
            row[0] = 1;
            return;
        }
        for (int j = i; j > 0; j--) {
            row[j] = row[j] + row[j-1];
        }
    }

    public static void printRow(int n) {
        int[] row = new int[n];
        for (int i = 0; i < n; i++) {
            createRow(row,i);
            printSpace(n, i);
            for (int j = 0; j <= i ; j++) {
                System.out.printf("%-4d", row[j]);
            }
            System.out.println();
        }
    }




    //commons parties
    private static void printSpace(int n, int i) {
        int s = (n - 1 - i) * 2;
        for (int j = 0; j < s; j++) {
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        //int v = triangle(4, 2);
        //printElement(5);
        printRow(5);
    }
}
