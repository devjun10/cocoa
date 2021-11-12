package main.java.callby;

public class Main {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        swap(a, b);
        System.out.println("a= "+a+", b= "+b);
    };


    static void swap(int x, int y){
        int temp = 0;
        temp = x;
        x = y;
        y = temp;
    }
}
