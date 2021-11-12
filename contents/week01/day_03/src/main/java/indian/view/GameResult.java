package main.java.indian.view;

public class GameResult {
    private final String result;

    public GameResult(String result) {
        this.result = result;
    }

    public String getResult() {
        return result;
    }

    public static GameResult of(String result){
        return new GameResult(result);
    }

    @Override
    public String toString() {
        return result;
    }
}
