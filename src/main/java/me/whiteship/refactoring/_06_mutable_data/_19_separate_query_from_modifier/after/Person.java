package me.whiteship.refactoring._06_mutable_data._19_separate_query_from_modifier.after;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
