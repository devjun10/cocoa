package main.java.model;


import java.util.List;

public class GameMachine {
    static StringBuilder sb = new StringBuilder();
    public void play() throws Exception {
        int cc=10;
        while(cc-->0){
            askGameContinueOrNot();
            int count = input();
            List<Member> shuffledMembers = getShuffledMembers(count);
            GameResult gameResult = GameResult.of(shuffledMembers);
            print(gameResult);
            cc--;
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

    public void print(GameResult result){
        OutputViewr.INSTANCE.print(result);
    }

    public void askGameContinueOrNot(){
        OutputViewr.INSTANCE.ask(sb);
    }
}