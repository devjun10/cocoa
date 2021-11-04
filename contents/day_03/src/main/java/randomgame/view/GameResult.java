package main.java.randomgame.view;

import main.java.randomgame.model.Member;

import java.util.List;

public class GameResult {
    private final List<Member> members;

    public GameResult(List<Member> members) {
        this.members = members;
    }

    public static GameResult of(List<Member> members){
        return new GameResult(members);
    }

    public List<Member> getMembers(){
        return this.members;
    }
}
