package me.whiteship.refactoring._06_mutable_data._20_remove_setting_method;

public class Person {

    private String name;

    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    // Setter가 열려있음. (요구사항과 관련없음) → 제거 필요함.
    public void setId(int id) {
        this.id = id;
    }
}
