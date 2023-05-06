package me.whiteship.refactoring._17_message_chain._37_hide_delegate.after;

public class Person {

    private String name;

    private Department department;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setDepartment(Department department) {
        this.department = department;
    }

    public Person getManager() {
        return this.department.getManager();
    }

}
