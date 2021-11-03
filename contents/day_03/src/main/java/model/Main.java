package main.java.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    private static final Random random = new Random();
    private static final List<String> names = new ArrayList<>(List.of(
            "Barney", "BC", "Bart", "Dave", "David", "Dike", "donggi", "Hanse", "Head", "hoo", "Jarry", "Jerry",
            "Jhin", "Jun", "Konda", "Lacon", "Mandoo", "meatsby", "Mk", "mong", "OS", "Phill",
            "sonny", "tasku", "Tany", "Teemo", "Yan", "young", "검봉", "노리", "땃쥐", "반스", "피오", "호두마루"));

    public static void main(String[] args) {
        getNames(3).forEach(System.out::println);
    };

    public static List<String> getNames(int number){
        Collections.shuffle(names);
        return names.subList(0, number);
    }

}