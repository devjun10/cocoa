package main.java.randomgame;

public enum Message {
    LINE("------------------------------------------------------------------------"),
    QUESTION("게임을 진행하려면 숫자를, 그만두고 싶다면 Q를 눌러주세요"),
    ENTER("\n");
    private final String description;

    Message(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Message{" +
                "description='" + description + '\'' +
                '}';
    }
}
