package main.java.model;

public enum IndianGameRule {
    MIN_NAME_SIZE(1), MAX_NAME_SIZE(34);

    private final int number;

    IndianGameRule(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
