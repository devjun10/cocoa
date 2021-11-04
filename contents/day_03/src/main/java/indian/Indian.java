package main.java.indian;

import java.util.Objects;

public class Indian {
    private final Long no;
    private final String name;

    public Indian(Long no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Indian indian = (Indian) o;
        return Objects.equals(no, indian.no);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no);
    }
}
