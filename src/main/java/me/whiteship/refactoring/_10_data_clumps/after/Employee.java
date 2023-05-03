package me.whiteship.refactoring._10_data_clumps.after;

import java.util.Optional;

// 중복되는 매개변수를 뽑아서 클래스로 만들어서, 변수의 변경지점을 하나로 모은다.
public class Employee {

    private String name;
    private TelephoneNumber personalPhoneNumber;

    // areaCode + Number가 함께 사용됨.
    public Employee(String name, TelephoneNumber telephoneNumber) {
        this.name = name;
        this.personalPhoneNumber = telephoneNumber;
    }

    public String getName() {
        Optional<String> o = Optional.ofNullable(null);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
