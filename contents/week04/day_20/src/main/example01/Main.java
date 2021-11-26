package main.example01;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    static int count = 5;

    public static void main(String[] args) {
        System.out.println("[실시간 카운트다운 및 자동종료]");

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if (count >= 1) {
                    System.out.println("카운트다운 : " + count + "");
                    count--; //실행횟수 증가
                } else {
                    timer.cancel();
                    System.out.println("카운트다운 : 종료");
                }
            }
        };
        timer.schedule(task, 1000, 1000);
    }
}
