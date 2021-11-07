package main.java.simplerpg.map;

import main.java.simplerpg.domain.Bomb;
import main.java.simplerpg.domain.Hero;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Bombs {
    public static final Map<Integer, Bomb> STORE = new ConcurrentHashMap<>();
    public Map<Integer, Bomb> getSTORE() {
        return STORE;
    }
}
