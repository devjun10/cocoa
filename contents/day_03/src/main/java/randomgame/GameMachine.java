package main.java.randomgame;


import main.java.randomgame.model.Member;
import main.java.randomgame.model.Members;
import main.java.randomgame.view.GameResult;

import java.util.List;

public class GameMachine {
    public GameResult play(int gameCount) {
        List<Member> shuffledMembers = getShuffledMembers(gameCount);
        return GameResult.of(shuffledMembers);
    }

    /**
     * 클래스 멤버 데이터 초기화
     * */
    static {
        Init init = new Init();
    }

    public List<Member> getShuffledMembers(int count){
        return Members.of().getShuffledMembers(count);
    }
}