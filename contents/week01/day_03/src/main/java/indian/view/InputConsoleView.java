package main.java.indian.view;

import main.java.indian.view.InputView;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InputConsoleView implements InputView {
    static StringBuilder sb = new StringBuilder();
    static Input input = new Input();
    static class Input {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        public int integer() throws Exception {
            if (!st.hasMoreElements()) st = new StringTokenizer(br.readLine());
            return Integer.parseInt(st.nextToken());
        }
        public String next() throws Exception{
            if(!st.hasMoreElements()) st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }
    }
    public static void main(String[] args) throws Exception {
        String[] s = input.br.readLine().split(" ");
        System.out.println(s.length);
        };

    @Override
    public void printStartManual() {
        System.out.println("인디언 게임을 시작하겠습니다. 안내에 따라 값을 입력해주세요.");
    }

    @Override
    public int inputYear() throws Exception {
        System.out.println("태어난 연도를 입력해주세요.");
        return input.integer()%1000;
    }

    @Override
    public int inputMonth() throws Exception {
        System.out.println("태어난 달을 입력해주세요.");
        return input.integer();
    }

    @Override
    public int inputDay() throws Exception {
        System.out.println("태어난 일을 입력해주세요.");
        return input.integer();
    }
}
