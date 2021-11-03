package main.java.indian.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// TODO. 싱글톤
public class InputView implements View {
    public static InputView of(){
        return new InputView();
    }

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer("");

    public int nInt() throws Exception{
        return Integer.parseInt(next());
    }

    public String next() throws Exception{
        if(!st.hasMoreElements()) st = new StringTokenizer(br.readLine());
            return st.nextToken();
    }
}
