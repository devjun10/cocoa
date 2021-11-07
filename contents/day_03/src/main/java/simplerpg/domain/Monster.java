package main.java.simplerpg.domain;

public class Monster implements Character{
    private int x;
    private int y;
    private String symbol;

    public Monster(int x, int y, String symbol) {
        this.x = x;
        this.y = y;
        this.symbol = symbol;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public String getSymbol() {
        return this.symbol;
    }


}
