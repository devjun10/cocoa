package main.java.indian;

import main.java.indian.view.*;

public class Main {
    static InputView inputView = new InputConsoleView();
    static OutputView outputView = new OutputConsoleView();

    public static void main(String[] args) throws Exception {
        Player player = new Player();
        GameMachine gameMachine = new GameMachine();

        int year = inputView.inputYear();
        int month = inputView.inputMonth();
        int day = inputView.inputDay();

        GameResult message = player.play(gameMachine, PlayerData.of(year, month, day));
        outputView.printGameResult(message);
    };
}