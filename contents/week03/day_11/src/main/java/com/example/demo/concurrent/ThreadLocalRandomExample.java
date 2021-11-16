package com.example.demo.concurrent;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;

public class ThreadLocalRandomExample {
    private int high;
    private int low;

    public ThreadLocalRandomExample(int high, int low) {
        this.high = high;
        this.low = low;
    }

    public void generatedRandom7() {
        System.out.println("Java7 방식");
        for (int i = 0; i < 100; i++) {
            System.out.println(
                    ThreadLocalRandom.current().nextInt(low, high));
        }

    }
}
