package com.example.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {
    public static void main(String args[]) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Task("First"));
        executorService.execute(new Task("Second"));
        executorService.execute(new Task("Third"));
        executorService.shutdown();
    }
}



class Task implements Runnable {
    private String id;

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Task Id= " + id + ", running ... " + i);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public Task(String id) {
        this.id = id;
    }
}