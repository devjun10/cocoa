package main.java.type;

public class Type {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        Monster monster = new Monster(1L, "Monster", 30);

        //array test
        int[] c = new int[5];
        c[0] = 0;
        System.out.println(c[0]);
        boo(c);
        System.out.println(c[0]);
    };

    private static int myDouble(int n) {
        n = n * 2;
        System.out.println(n);
        return n;
    }

    public static void foo(int[] a) {
        a[0] = 100;
    }

    public static void boo(int[] a) {
        a = new int[3];
        a[0] = 100;
        System.out.println(a[0]);
    }
}
