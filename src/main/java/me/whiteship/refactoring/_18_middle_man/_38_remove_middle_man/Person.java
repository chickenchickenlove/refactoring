package me.whiteship.refactoring._18_middle_man._38_remove_middle_man;

public class Person {

    private Department department;

    private String name;

    public Person(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public Person getManager() {
        // 그냥 department를 통해서 직접 manager를 호출하는게 더 좋을 듯? (중재자 냄새)
        return this.department.getManager();
    }
}
