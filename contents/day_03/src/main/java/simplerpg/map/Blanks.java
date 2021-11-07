package main.java.simplerpg.map;

import main.java.simplerpg.domain.Hero;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Blanks {
    public static final Map<Integer, Hero> STORE = new ConcurrentHashMap<>();

    public Map<Integer, Hero> getSTORE() {
        return STORE;
    }
}
