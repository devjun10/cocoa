package main.java.model;

import java.util.List;

public class NameResult {
    private final List<Name> names;

    public NameResult(List<Name> names) {
        this.names = names;
    }

    public List<Name> getNames() {
        return names;
    }

}
