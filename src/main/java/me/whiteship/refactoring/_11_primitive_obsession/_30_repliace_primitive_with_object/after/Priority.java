package me.whiteship.refactoring._11_primitive_obsession._30_repliace_primitive_with_object.after;

import java.util.List;

public class Priority {

    private String value;
    private List<String> legalValues = List.of("low", "normal", "high", "rush");

    public Priority(String value) {
        if (legalValues.contains(value))
            this.value = value;
        else
            throw new IllegalArgumentException("illegal value for priority" + value);
    }

    public boolean higherThan(Priority other) {
        return this.index() > other.index();
    }

    private int index() {
        return this.legalValues.indexOf(this.value);
    }

}