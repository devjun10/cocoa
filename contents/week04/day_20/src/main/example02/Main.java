package main.example02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

public class Main {

    public static void main(String[] args) {
       Timer timer = new Timer();
        TimerTask task = new Helper();
        timer.schedule(task, 1000, 1000);

        swingTimer();

    }
    static void swingTimer(){
        Timer timer = new Timer(String.valueOf(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("new test");
            }
        }));
        try{
            System.out.println("멈춤");
            Thread.sleep(5000);
        }catch(Exception e){
            System.exit(1);
        }
        timer.cancel();
        System.out.println("Closed");
    }

}

