package multi_recursion;

import java.util.LinkedList;

public class HanoiTower {
    static LinkedList<Integer> a = new LinkedList<>();
    static LinkedList<Integer> b = new LinkedList<>();
    static LinkedList<Integer> c = new LinkedList<>();

    static void init(int n) {
        for (int i = n; i >= 1; i--) {
            a.addLast(i);
        }
    }

    /**
     *
     * @param n: quantity of
     * @param a: disk from
     * @param b: disk via
     * @param c: disk to
     */
    static void move(int n,
                     LinkedList<Integer> a,
                     LinkedList<Integer> b,
                     LinkedList<Integer> c) {
        if (n == 0) {
            return;
        }
        move(n-1, a, c, b);
        c.addLast(a.removeLast());
        move(n-1, b, a, c);
    }

    public static void main(String[] args) {
        init(3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        move(3, a, b, c);
        /*
        b.addLast(a.removeLast());
        c.addLast(a.removeLast());
        c.addLast(b.removeLast());
        b.addLast(a.removeLast());
        a.add(c.removeLast());
        b.addLast(c.removeLast());
        b.addLast(a.removeLast());
        */

        System.out.println("************");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
