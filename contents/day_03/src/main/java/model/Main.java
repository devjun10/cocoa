package main.java.model;

public class Main {
    public static void main(String[] args) throws Exception {
        Player player = new Player();
        GameMachine gameMachine = new GameMachine();
        player.play(gameMachine);
    }
}