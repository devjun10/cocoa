package main.java.indian.model;

import java.util.Objects;

public class Member {
    private final Long id;
    private final Name name;

    public Member(Long id, Name name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
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
        return Objects.equals(id, member.id) && Objects.equals(name, member.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return String.valueOf(name);
    }
}
