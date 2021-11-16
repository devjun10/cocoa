package com.example.demo;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class DelayedTaskExample {
    public static void main(String[] args) throws Exception {
        ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();

        executorService.schedule(() -> System.out.println("Todo 1"), 1, TimeUnit.SECONDS);
        executorService.schedule(() -> System.out.println("Todo 2"), 3, TimeUnit.SECONDS);
        executorService.schedule(() -> System.out.println("Todo 3"), 10, TimeUnit.SECONDS);
    }
}
