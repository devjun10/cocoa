package main.java.model;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

public class Member implements Comparable<Member>{
    private static final int MIN_MEMBER_SIZE = 0;
    private static final int MAX_MEMBER_SIZE = 34;

    private final Integer id;
    private final Name name;
    private static final Map<Integer, Member> cache = new ConcurrentHashMap<>();
    private static final List<String> nameList = List.of(
            "Barney", "BC", "Bart", "Dave", "David", "Dike", "donggi", "Hanse", "Head", "hoo", "Jarry", "Jerry",
            "Jhin", "Jun", "Konda", "Lacon", "Mandoo", "meatsby", "Mk", "mong", "OS", "Phill",
            "sonny", "tasku", "Tany", "Teemo", "Yan", "young", "검봉", "노리", "땃쥐", "반스", "피오", "호두마루");


    static {
        for(int i=1; i<MAX_MEMBER_SIZE; i++){
            cache.put(i, new Member(i, new Name(nameList.get(i-1))));
        }
    }

    public Member(Integer id, Name name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public Name getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(id, member.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Member o) {
        return Integer.compare(this.id, o.id);
    }
}