package main.java.simplerpg;

import java.util.Random;

public class Sample {
    static Random random = new Random();
    static int [][] temp = new int[4][4];
    private final static int[][] map = new int[4][4];
    private final static int[][] answer = new int[4][4];
    static int[] numbers = new int[16];

    static {
        for(int i=0; i<16; i++){
            numbers[i] = i+1;
        }
        numbers[15] = 0;
        for(int i=0; i<16; i++){
            answer[i/4][i%4] = i+1;
        }

        for(int i=0; i<16; i++){
            map[i/4][i%4] = temp[i/4][i%4];
        }
    }

    public static void shuffle(int[] array){
        for(int i=0; i<16; i++){
            temp[i/4][i%4] = array[i];
        }
    }

    public static int[] mixingNumbers(int[] arr){
        for(int x=0;x<arr.length;x++){
            int i = (int)(Math.random()*arr.length);
            int j = (int)(Math.random()*arr.length);
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] array = new int[3][3];
        int k=1;
        for(int row=0; row<3;row++) {
            for (int col = 0; col < 3; col++) {
                array[row][col] = k;
                k++;
            }
        }
        shuffle(mixingNumbers(numbers));

        for(int row=0; row<4;row++){
            System.out.println();
            for(int col=0;col<4; col++){
                System.out.print(temp[row][col]+" ");
            }
        }
    };
}
