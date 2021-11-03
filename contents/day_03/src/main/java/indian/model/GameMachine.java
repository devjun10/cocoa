package main.java.indian.model;

import java.util.Collections;
import java.util.List;

public class GameMachine {
    private View view;
    private static StringBuilder builder = new StringBuilder();
    public void printNames(List<Member>members){
        view = OutputView.of().getInstance();
    }

    public int input(){
        view = InputView.of();
        return 6;
    }

    public void ask(){
        builder.append("추가로 게임을 더 진행하시겠습니까?");
        builder.append("계속 진행하고 싶은 경우 원하는 숫자를");
    }

    public void shuffle(){
        Collections.shuffle(Members.repository);
    }

    // TODO Repo 초기화
    public List<Member> getMembers(int number){
        MemberFactory memberFactory = new MemberFactory();
        return Members.repository.subList(0, number);
    }

    public void play() {
        int k=5;
        while(true){
            int number = input();
            shuffle();
            getMembers(number).forEach(System.out::println);
            k--;
            if(k==1)
                break;
        }
    }


}