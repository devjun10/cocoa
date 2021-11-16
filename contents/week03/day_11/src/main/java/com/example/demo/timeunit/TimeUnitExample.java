package com.example.demo.timeunit;

import java.util.concurrent.TimeUnit;

public class TimeUnitExample {

    public static void main(String[] args) throws Exception {
        Thread.sleep(1000);
        TimeUnit.SECONDS.sleep(1);
        TimeUnit.MILLISECONDS.sleep(1000);
    }
}

