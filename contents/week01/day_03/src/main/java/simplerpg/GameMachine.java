package main.java.simplerpg;

import main.java.simplerpg.map.Characters;

public class GameMachine {
    void play(){
        Init init = new Init();
    }

    public boolean explosionBomb(int x, int y){
        return x == Characters.STORE.get(Symbol.BOMB).getX() && y == Characters.STORE.get(Symbol.BOMB).getY();
    }

    public boolean meetMonster(int x, int y){
        return x == Characters.STORE.get(Symbol.MONSTER).getX() && y == Characters.STORE.get(Symbol.MONSTER).getY();
    }

    public static boolean moveable(int x, int y){
        return x>=0 && x<4 && y>=0 && y<4;
    }

    public int nextX(int x, String input){
        int next_x = x + Direction.findDirection(input).getPosition().get(1);
        return next_x;
    }

    public int nextY(int y, String input){
        int next_y = y + Direction.findDirection(input).getPosition().get(0);
        return next_y;
    }
}