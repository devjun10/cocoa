package main.example02;

import java.util.TimerTask;

class Helper extends TimerTask {
    int i = 0;

    @Override
    public void run() {
        System.out.println("Timer Task running..." + i++);
    }

}
