package main.java.indian.view;

public class PlayerData {
    private final int year;
    private final int month;
    private final int day;

    public PlayerData(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static PlayerData of(int year, int month, int day){
        return new PlayerData(year, month, day);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}