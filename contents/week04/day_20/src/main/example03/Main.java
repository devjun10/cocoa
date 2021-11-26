package main.example03;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    private Timer timer;

    public static void main(String args[]) {
        Main main = new Main();
        main.setTimer(2000, 1000);
    }

    public class TaskToDo extends TimerTask {
        int count = 0;

        @Override
        public void run() {
            System.out.println(count + " Task");
            count += 1;
            if (count == 10) {
                System.out.println(count + " Task");
                System.exit(1);
            }
        }
    }

    public void setTimer(long delay, long period) {
        timer = new Timer();
        timer.schedule(new TaskToDo(), delay, period);
    }

}
