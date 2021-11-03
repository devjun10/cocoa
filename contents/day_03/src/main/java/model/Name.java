package main.java.model;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class Name {
    private static final int MIN_MEMBER_SIZE = 1;
    private static final int MAX_MEMBER_SIZE = 34;
    private final String value;
    private static final Map<Long, Name> memberNames = new ConcurrentHashMap<>();
    private static final List<String> nameList = List.of(
            "Barney", "BC", "Bart", "Dave", "David", "Dike", "donggi", "Hanse", "Head", "hoo", "Jarry", "Jerry",
            "Jhin", "Jun", "Konda", "Lacon", "Mandoo", "meatsby", "Mk", "mong", "OS", "Phill",
            "sonny", "tasku", "Tany", "Teemo", "Yan", "young", "검봉", "노리", "땃쥐", "반스", "피오", "호두마루");

    static {
        for(int i=1; i<=MAX_MEMBER_SIZE; i++){
            memberNames.put((long)i, new Name(nameList.get(i)));
        }
    }

    public static Name getInstance(int number){
        return memberNames.get(number);
    }

    public Name(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return Objects.equals(value, name.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}