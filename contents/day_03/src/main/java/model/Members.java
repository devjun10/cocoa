package main.java.model;

import java.util.*;

public class Members {
    private static final int MIN_MEMBER_SIZE = 1;
    private static final int MAX_MEMBER_SIZE = 34;
    public static final List<Member> list= new ArrayList<>();
    private static final List<String> nameList = List.of(
            "Barney", "BC", "Bart", "Dave", "David", "Dike", "donggi", "Hanse", "Head", "hoo", "Jarry", "Jerry",
            "Jhin", "Jun", "Konda", "Lacon", "Mandoo", "meatsby", "Mk", "mong", "OS", "Phill",
            "sonny", "tasku", "Tany", "Teemo", "Yan", "young", "검봉", "노리", "땃쥐", "반스", "피오", "호두마루");

    static {
        for(int i=0; i<MAX_MEMBER_SIZE; i++){
            Members.list.add(new Member(i, new Name(nameList.get(i))));
        }
    }

}