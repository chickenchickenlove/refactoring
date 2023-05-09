package me.whiteship.refactoring._11_primitive_obsession._31_replace_type_code_with_subclasses.direct_inheritance.after;

// Employee는 Type이라는 값으로 Enginner / Manager / Salesman을 각각 표현하고 있음.
// 타입 코드를 서브 클래스로 나누는 작업이 필요하다.
public abstract class Employee {

    // 타입이 필요없기 때문에 타입 제거함.
    private String name;

    // 하위 클래스만 사용할 것이기 때문에 수정함.
    protected Employee(String name) {
        this.name = name;
    }

    public static Employee createEmployee(String name, String type) {
        return switch (type) {
            case "engineer" -> new Engineer(name);
            case "manager" -> new Manager(name);
            case "salesMan" -> new SalesMan(name);
            default -> throw new IllegalArgumentException(type);
        };
    }

    public abstract String getType();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", type='" + "employee" + '\'' +
                '}';
    }
}
