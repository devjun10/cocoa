package main.java.randomgame;


import main.java.randomgame.model.Member;
import main.java.randomgame.model.Members;

import java.util.List;

public class GameMachine {
    static StringBuilder sb = new StringBuilder();
    public void play() throws Exception {
        while(true){
            askGameContinueOrNot();
            int count = input();
            List<Member> shuffledMembers = getShuffledMembers(count);
            GameResult gameResult = GameResult.of(shuffledMembers);
            print(gameResult);
        }
    }

    /**
     * 클래스 멤버들의 데이를 초기화
     * */
    static {
        Init init = new Init();
    }

    public int input() throws Exception {
        return InputViewr.INSTANCE.input();
    }

    public List<Member> getShuffledMembers(int count){
        return Members.of().getShuffledMembers(count);
    }

    public void print(GameResult gameResult){
        OutputViewr.INSTANCE.print(gameResult);
    }

    public void askGameContinueOrNot(){
        OutputViewr.INSTANCE.ask(sb);
    }
}