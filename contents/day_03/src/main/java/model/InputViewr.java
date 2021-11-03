package main.java.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public enum InputViewr implements Viewer{
    INSTANCE;

    InputViewr() {}
    public int input() throws Exception {
        return input.integer();
    }

    static Input input = new Input();
    static class Input {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
        public int integer() throws Exception{
            if(!st.hasMoreElements()) st = new StringTokenizer(br.readLine());
            return Integer.parseInt(st.nextToken());
        }
    }
}