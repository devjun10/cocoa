package main.java.indian.enum_;

import java.util.Arrays;

/**
 * 출처: 파이낸셜 뉴스
 * https://www.fnnews.com/news/201201101439568824
 *
 * 선택지가 두 개인 년도는 임의로 하나를 선택
 * ex) xxx0년 생: 말 많은 / 시끄러운 중 택1 -> 말 많은
 * */
public enum Year implements GameRule {
    LAST_NUMBER_0(0, "말 많은"), LAST_NUMBER_1(1, "푸른"),
    LAST_NUMBER_2(2, "어두운"), LAST_NUMBER_3(3, "조용한"),
    LAST_NUMBER_4(4, "웅크린"), LAST_NUMBER_5(5, "백색"),
    LAST_NUMBER_6(6, "지혜로운"), LAST_NUMBER_7(7, "용감한"),
    LAST_NUMBER_8(8, "날카로운"), LAST_NUMBER_9(9, "욕심많은");

    private final int value;
    private final String description;

    Year(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public static Year findMonth(int input){
        return Arrays.stream(values())
                .filter(year -> year.value==input)
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
