package main.java.simplerpg;

import main.java.simplerpg.domain.Bomb;
import main.java.simplerpg.domain.Hero;
import main.java.simplerpg.domain.Monster;
import main.java.simplerpg.map.Bombs;
import main.java.simplerpg.map.Characters;
import main.java.simplerpg.map.Heros;
import main.java.simplerpg.map.Monsters;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Init {
    private static final int START_NUMBER = 0;
    private static final int END_NUMBER = 5;
    private static final List<Integer> numbers= new ArrayList<>(List.of(0,1,2,3,4));

    static {
        initMap();
        characterInit();
        initMonster();
        initBomb();
    }

    static void characterInit(){
        Heros.STORE.clear();
        Characters.MAP[2][2] = "H";
        Heros.STORE.put(0, new Hero(2, 2, "H"));
    }

    static void initMap(){
        for(int row=0; row<5; row++){
            for(int col=0; col<5; col++){
                Characters.MAP[row][col]="O";
            }
        }
    }

    static boolean isBlank2(int x, int y){
        return Characters.MAP[x][y].equals("O");
    }

    static void initMonster() {
        int x = shuffle();
        int y = shuffle();
        if (!isBlank2(x, y))
            initMonster();
        Monsters.STORE.clear();
        Monsters.STORE.put(0, new Monster(x, y, "M"));
        Characters.MAP[x][y] = "M";
        return;
    }

    static void initBomb() {
        int x = shuffle();
        int y = shuffle();
        if (!isBlank2(x, y))
            initBomb();
        Bombs.STORE.clear();
        Bombs.STORE.put(0, new Bomb(x, y, "B"));
        Characters.MAP[x][y] = "B";
        return;
    }

    static int shuffle(){
        Collections.shuffle(numbers);
        return numbers.get(0);
    }
}
