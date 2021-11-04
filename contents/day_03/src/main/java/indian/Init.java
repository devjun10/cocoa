package main.java.indian;

import main.java.indian.repo.Day;
import main.java.indian.repo.Month;
import main.java.indian.repo.Year;

import java.util.List;

public class Init {
    private static final int YEAR_START_NUMBER = 0;
    private static final int YEAR_END_NUMBER = 9;
    private static final int MONTH_START_NUMBER = 1;
    private static final int MONTH_END_NUMBER = 12;
    private static final int DAY_START_NUMBER = 1;
    private static final int DAY_END_NUMBER = 31;

    static List<String> years = List.of("시끄러운, 말 많은", "푸른", "어두운, 적색", "조용한", "웅크린", "백색", "지혜로운", "용감한", "날카로운", "욕심많은");
    static List<String> month = List.of("늑대", "태양", "양", "매", "황소", "불꽃", "나무", "달빛", "말", "돼지", "하늘", "바람");
    static List<String> days = List.of("와(과) 함께 춤을", "의 기상", "은(는) 그림자속에", "", "", "", "의 환생",
            "의 죽음", "아래에서", "을(를) 보라", "이(가) 노래하다.", "의 그림자", "의 일격", "에게 쫓기는 남자",
            "의 행진", "의 왕", "의 유령", "을(를) 죽인자", "은(는) 맨날 잠잔다", "처럼", "의 고향",
            "의 전사", "은(는) 나의 친구", "의 노래", "의 정령", "의 파수꾼", "의 악마", "와(과) 같은 사나이", "을(를) 쓰러트린 자", "의 혼",
            "은(는) 말이 없다.");

    static {
        for(int i=YEAR_START_NUMBER; i<=YEAR_END_NUMBER; i++){
            Year.values.put(i, years.get(i));
        }
        for(int i=MONTH_START_NUMBER; i<= MONTH_END_NUMBER; i++){
            Month.values.put(i, month.get(i-1));
        }
        for(int i=DAY_START_NUMBER; i<=DAY_END_NUMBER; i++){
            Day.values.put(i, days.get(i-1));
        }
    }
}