package main.java.simplerpg;

import main.java.simplerpg.map.Characters;

public class Main {
    public static void main(String[] args) {
        GameMachine gameMachine = new GameMachine();
        for(int i=0; i<5;i++) {
            for (int row = 0; row < 5; row++) {
                System.out.println();
                for (int col = 0; col < 5; col++) {
                    System.out.print(Characters.MAP[row][col] + " ");
                }
            }
            System.out.println();
            System.out.println("===================================");
            System.out.println();
        }
    };
}
