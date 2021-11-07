package main.java.simplerpg.domain;

import java.util.Objects;

public class Bomb implements Character {
    private int x;
    private int y;
    private String symbol;

    public Bomb(int x, int y, String symbol) {
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

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bomb bomb = (Bomb) o;
        return x == bomb.x && y == bomb.y && Objects.equals(symbol, bomb.symbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, symbol);
    }
}
