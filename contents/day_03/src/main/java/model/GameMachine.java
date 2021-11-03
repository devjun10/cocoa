package main.java.model;


import java.util.Collections;
import java.util.List;

public class GameMachine {
    static StringBuilder sb = new StringBuilder();
    public void play() {
        int count=10;
        while(count-->0){
            ask();
            int number = input();
            shuffleMembers();
            GameResult gameResult = GameResult.of(selectMembers(number));
            print(gameResult);
            count--;
        }
    }

    public int input(){
//        InputViewr.INSTANCE;
        return 5;
    }

    public void shuffleMembers(){
        Collections.shuffle(Members.list);
    }

    public List<Member> selectMembers(int number){
        return Members.list.subList(0, number);
    }

    public void print(GameResult result){
        OutputViewr.INSTANCE.print(result);
    }

    public void ask(){
        OutputViewr.INSTANCE.ask(sb);
    }
}