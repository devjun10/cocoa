package main.java.simplerpg.map;

import main.java.simplerpg.domain.Bomb;
import main.java.simplerpg.domain.Monster;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Monsters {
    public static final Map<Integer, Monster> STORE = new ConcurrentHashMap<>();

    public Map<Integer, Monster> getSTORE() {
        return STORE;
    }
}
