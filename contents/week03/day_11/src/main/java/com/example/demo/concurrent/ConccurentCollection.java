package com.example.demo.concurrent;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class ConccurentCollection {

    private BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
    Runnable producer = () -> {
        Random random = new Random();
        try {
            TimeUnit.SECONDS.sleep(1);
            int num = random.nextInt(100);
            queue.put(num);
            System.out.println("생성한 항목 값= " + num + ", Queue.size()= " + queue.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };

    Runnable consumer = () -> {
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println("Queue.take()= " + queue.take() + ", Queue.size()= " + queue.size());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    };

    public void execute(int producersSize, int consumersSize) {
        for (int i = 0; i < producersSize; i++) {
            new Thread(producer, "생성자" + (i + 1)).start();
        }

        for (int i = 0; i < producersSize; i++) {
            new Thread(consumer, "소비자" + (i + 1)).start();
        }
    }

    public static void main(String[] args) throws Exception {
        ConccurentCollection cl = new ConccurentCollection();
        cl.execute(7, 9);
    }
}
