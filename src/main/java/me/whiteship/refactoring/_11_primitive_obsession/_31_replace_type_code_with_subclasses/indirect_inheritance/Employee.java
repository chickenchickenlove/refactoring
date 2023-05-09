package me.whiteship.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.indirect_inheritance;

import java.util.List;

// Employee에 enginner, manager, salesman 타입이 존재한다.
// 타입을 서브 클래스로 추출하려고 했지만, 이미 FullTimeEmployee 같은 서브 클래스가 존재한다.
// 이 때는 타입을 서브 클래스로 추출하는 것이 아니라, 타입에 대한 클래스를 만들고 그 클래스에 필요한 메서드를 구현한 다음, 위임하도록 한다.
public class Employee {

    private String name;
    private String type;

    public Employee(String name, String type) {
        this.validate(type);
        this.name = name;
        this.type = type;
    }

    private void validate(String type) {
        List<String> legalTypes = List.of("engineer", "manager", "salesman");
        if (!legalTypes.contains(type)) {
            throw new IllegalArgumentException(type);
        }
    }

    public String capitalizedType() {
        return this.type.substring(0, 1).toUpperCase() + this.type.substring(1).toLowerCase();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
