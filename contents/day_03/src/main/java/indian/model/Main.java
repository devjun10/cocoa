package main.java.indian.model;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        GameMachine machine = new GameMachine();
        player.play(machine);
    };
}