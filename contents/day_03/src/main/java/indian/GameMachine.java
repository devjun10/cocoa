package main.java.indian;

public class GameMachine {
    InputViewr inputViewr;
    public void play() {

    }

    /**
     * 데이터 초기화
     * */
    static {
        Init init = new Init();
    }

    public int inputYear() throws Exception {
        return InputViewr.INSTANCE.input();
    }
}
