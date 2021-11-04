package main.java.indian.enum_;

import java.util.Arrays;

/**
 * 출처: 파이낸셜 뉴스
 * https://www.fnnews.com/news/201201101439568824
 * */
public enum Month implements GameRule {
    JANUARY(1, "늑대"), FEBRUARY(2, "태양"), MARCH(3, "양"),
    APRIL(4, "매"), MAY(5, "황소"), JUNE(6, "불꽃"),
    JULY(7, "나무"), AUGUST(8, "달빛"), SEPTEMBER(9, "말"),
    OCTOBER(10, "돼지"), NOVEMBER(11, "하늘"), DECEMBER(12, "바람");

    private final int value;
    private final String description;

    Month(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public static Month findMonth(int input){
        return Arrays.stream(values())
                .filter(month -> month.value==input)
                .findAny()
                .orElseThrow(IllegalArgumentException::new);
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }
}
