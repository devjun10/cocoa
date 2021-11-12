package main.java.simplerpg.map;

import main.java.simplerpg.Symbol;
import main.java.simplerpg.domain.Character;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Characters {
    public static final Map<Symbol, ? extends Character> STORE = new ConcurrentHashMap<>();
    public static final String[][] MAP = new String[5][5];
    public static String[][] of(){
        return MAP;
    }
}
