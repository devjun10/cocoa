package main.java.simplerpg;

public enum Symbol {
    MONSTER("몬스터", "M"), HERO("캐릭터", "H"), BOMB("폭탄", "B"), BLANK("빈 칸", "B");
    private final String description;
    private final String symbol;

    Symbol(String description, String symbol) {
        this.description = description;
        this.symbol = symbol;
    }

    public String getDescription() {
        return description;
    }

    public String getSymbol() {
        return symbol;
    }
}