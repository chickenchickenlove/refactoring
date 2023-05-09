package me.whiteship.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.direct_inheritance;

import java.util.List;

// Employee는 Type이라는 값으로 Enginner / Manager / Salesman을 각각 표현하고 있음.
// 타입 코드를 서브 클래스로 나누는 작업이 필요하다.
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

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
