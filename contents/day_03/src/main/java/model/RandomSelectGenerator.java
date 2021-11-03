package main.java.model;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomSelectGenerator {
    private static final int START = 0;

    private static List<Name> memberNames = new ArrayList<>();

    static {
//        for (int i = MIN_L.get(); i <= MAX_LOTTO_NUMBER.get(); i++) {
//            memberNames.add(Name.getInstance(i));
//        }
    }

    public static List<Name> generate(int count) {
        Collections.shuffle(memberNames);
        return memberNames.subList(START, count);
    }
}