package main.java.indian;


import main.java.indian.repo.Day;
import main.java.indian.repo.Month;
import main.java.indian.repo.Year;
import main.java.indian.view.GameResult;
import main.java.indian.view.PlayerData;

public class GameMachine {
    static StringBuilder sb = new StringBuilder();
    public GameResult play(PlayerData data) {
        String year = Year.values.get(getLastNumberOfYear(data.getYear()));
        String month = Month.values.get(data.getMonth());
        String day = Day.values.get(data.getDay());
        return GameResult.of(getResult(year, month, day));
    }

    /**
     * 데이터 초기화
     * */
    static {
        Init init = new Init();
    }

    private int getLastNumberOfYear(int number){
        while (number>10){
            number%=10;
        }
        System.out.println(number);
        return number;
    }

    private String getResult(String year, String month, String day){
        sb.setLength(0);
        return sb.append(year)
                .append(month)
                .append(day).toString();
    }

}