package main.java.randomgame.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InputConsoleView implements InputView {
    static Input input = new Input();
    static StringBuilder sb = new StringBuilder();
    static class Input {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        public int integer() throws Exception{
            if(!st.hasMoreElements()) st = new StringTokenizer(br.readLine());
            return Integer.parseInt(st.nextToken());
        }
    }

    @Override
    public void printStartManual() {
        System.out.println("몇 명의 클래스 멤버를 출력할까요?");
    }

    @Override
    public int inputGameCount() throws Exception {
        return input.integer();
    }


}
