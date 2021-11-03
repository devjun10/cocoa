package main.java.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        GameMachine gameMachine = new GameMachine();
        player.play(gameMachine);
    };
}