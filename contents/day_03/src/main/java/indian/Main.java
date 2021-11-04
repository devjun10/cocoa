package main.java.indian;


import main.java.indian.view.InputConsoleView;
import main.java.indian.view.InputView;
import main.java.randomgame.view.OutputConsoleView;
import main.java.randomgame.view.OutputView;

public class Main {
    static InputView inputView = new InputConsoleView();
    static OutputView outputView = new OutputConsoleView();

    public static void main(String[] args) throws Exception {
        Player player = new Player();
        GameMachine gameMachine = new GameMachine();

        int year = inputView.inputYear();
        int month = inputView.inputMonth();
        int day = inputView.inputDay();
        PlayerData playerData = new PlayerData(year, month, day);

        player.play(gameMachine, playerData);
    };
}
