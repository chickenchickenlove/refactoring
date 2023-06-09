package me.whiteship.refactoring._18_middle_man._38_remove_middle_man.after;

public class Person {

    private Department department;

    private String name;

    public Person(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public Department getDepartment() {
        // Department를 반환해주고, 이를 통해 manager를 직접 호출.
        return this.department;
    }
}
