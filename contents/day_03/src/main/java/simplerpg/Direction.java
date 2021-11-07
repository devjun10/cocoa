package main.java.simplerpg;

import java.util.Arrays;
import java.util.List;

public enum Direction {
    W("상", List.of(0, -1)), A("좌", List.of(-1,0)),
    S("하", List.of(0, 1)), D("D", List.of(1, 0));
    private final String description;
    private List<Integer> position;

    Direction(String description, List<Integer> position) {
        this.description = description;
        this.position = position;
    }

    public static Direction findDirection(String word){
        return Arrays.stream(Direction.values())
                .filter(direction->direction.description.equals(word))
                .findAny()
                .orElseThrow();
    }

    public String getDescription() {
        return description;
    }

    public List<Integer> getPosition() {
        return position;
    }
}

