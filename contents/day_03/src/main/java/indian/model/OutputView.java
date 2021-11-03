package main.java.indian.model;

import java.util.List;

// TODO. 싱글톤
public class OutputView implements View {
    public static OutputView of(){
        return new OutputView();
    }

    public OutputView getInstance(){
        return new OutputView();
    }

    public void print(List<Member> members){
        members.forEach(member -> System.out.println(member.getName()));
    }
}
