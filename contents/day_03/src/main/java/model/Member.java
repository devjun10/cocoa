package main.java.model;

import java.util.Objects;

public class Member implements Comparable<Member>{
    private final Integer id;
    private final Name name;

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

    @Override
    public String toString() {
        return name.toString();
    }
}