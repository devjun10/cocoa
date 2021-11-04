package main.java.indian;


import main.java.indian.repo.Day;
import main.java.indian.repo.Month;
import main.java.indian.repo.Year;

public class GameMachine {
    static StringBuilder sb = new StringBuilder();
    public GameResult play(PlayerData data) {
        String year = Year.values.get(data.getYear());
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

    private String getResult(String year, String month, String day){
        sb.setLength(0);
        return sb.append(year)
                .append(month)
                .append(day).toString();
    }

}
