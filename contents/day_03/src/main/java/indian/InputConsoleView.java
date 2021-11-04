package main.java.indian;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InputConsoleView implements InputView{
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
        System.out.println("인디언 게임을 시작하겠습니다. 안내에 따라 값을 입력해주세요.");
    }

    @Override
    public int askYear() throws Exception {
        System.out.println("태어난 연도를 입력해주세요.");
        return input.integer()%1000;
    }

    @Override
    public int askMonth() throws Exception {
        System.out.println("태어난 달을 입력해주세요.");
        return input.integer();
    }

    @Override
    public int askDay() throws Exception {
        System.out.println("태어난 일을 입력해주세요.");
        return input.integer();
    }
}
