package me.whiteship.refactoring._17_message_chain._37_hide_delegate;

public class Person {

    private String name;

    private Department department;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 삭제 필요. + getManager()를 추가해서 위임 숨기기
    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
