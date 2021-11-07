package main.java.simplerpg.domain;

import java.util.Objects;

public class Blank implements Character {
    private int x;
    private int y;
    private String symbol;

    public Blank(int x, int y, String symbol) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Blank blank = (Blank) o;
        return x == blank.x && y == blank.y && Objects.equals(symbol, blank.symbol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, symbol);
    }
}