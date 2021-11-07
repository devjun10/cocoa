package main.java.simplerpg.domain;

import main.java.simplerpg.Direction;

public class Hero implements Character {
    private int x;
    private int y;
    private final String symbol;

    public static Hero of(){
        return new Hero(2, 2, "H");
    }

    public Hero(int x, int y, String symbol) {
        this.x = x;
        this.y = y;
        this.symbol = symbol;
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public int getY() {
        return y;
    }

    @Override
    public String getSymbol() {
        return symbol;
    }

    public int moveX(String direction){
        return this.x + Direction.findDirection(direction).getPosition().get(1);
    }

    public int moveY(String direction){
        return this.y + Direction.findDirection(direction).getPosition().get(0);
    }





}
