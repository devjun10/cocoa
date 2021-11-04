package main.java.indian.enum_;

import java.util.Arrays;
/**
 * 출처: 파이낸셜 뉴스
 * https://www.fnnews.com/news/201201101439568824
 * */
public enum Day implements GameRule{
    OF_01(1, "와(과) 함께 춤을"), OF_02(2,"의 기상"), OF_03(3, "은(는) 그림자 속에"),
    OF_04(4, ""), OF_05(5, ""), OF_06(6, ""),
    OF_07(7, "의 환생"), OF_08(8, "의 죽음"), OF_09(9, " 아래에서"),
    OF_10(10, "를(을) 보라"), OF_11(11, "이(가) 노래하다."), OF_12(12, "그림자"),
    OF_13(13, "의 일격"), OF_14(14, "에게 쫓기는 남자"), OF_15(15, "의 행진"),
    OF_16(16, "의 왕"), OF_17(17, "의 유령"), OF_18(18, "을 죽인자."),
    OF_19(19, "는(은) 맨날 잠잔다."), OF_20(20, " 처럼"), OF_21(21, "의 고찰"),
    OF_22(22,  "의 전사"), OF_23(23, "은(는) 나의 친구"), OF_24(24, "의 노래"),
    OF_25(25, "의 정령"), OF_26(26, "의 파수꾼"), OF_27(27, "의 악마"),
    OF_28(28, "와(과) 같은 사나이"), OF_29(29, "를(을) 쓰러트린자"), OF_30(30, "의 혼"),
    OF_31(31, "은(는) 말이 없다.");

    private final int value;
    private final String description;

    Day(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public static Day findDay(int input){
        return Arrays.stream(values())
                .filter(day -> day.value==input)
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
