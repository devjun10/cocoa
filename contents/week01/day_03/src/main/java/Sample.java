package main.java;

public class Sample {
    static String[][] array = new String[5][5];

    public static void main(String[] args) {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 5; col++) {
                array[row][col] = "O";
            }
        }
        array[2][2] = "H";
        print();
    }


    static void print() {
        for (int row = 0; row < 5; row++) {
            System.out.println();
            for (int col = 0; col < 5; col++) {
                System.out.print(array[row][col]+" ");
            }
        }
    }
}