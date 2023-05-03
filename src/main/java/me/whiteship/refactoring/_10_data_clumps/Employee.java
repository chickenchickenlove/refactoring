package me.whiteship.refactoring._10_data_clumps;

// 중복되는 매개변수를 뽑아서 클래스로 만들어서, 변수의 변경지점을 하나로 모은다.
public class Employee {

    private String name;
    // areaCode + Number가 함께 사용됨.
    // Office 클래스에도 존재함.
    private String personalAreaCode;
    private String personalNumber;

    // areaCode + Number가 함께 사용됨.
    public Employee(String name, String personalAreaCode, String personalNumber) {
        this.name = name;
        this.personalAreaCode = personalAreaCode;
        this.personalNumber = personalNumber;
    }

    public String personalPhoneNumber() {
        return personalAreaCode + "-" + personalNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalAreaCode() {
        return personalAreaCode;
    }

    public void setPersonalAreaCode(String personalAreaCode) {
        this.personalAreaCode = personalAreaCode;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    public void setPersonalNumber(String personalNumber) {
        this.personalNumber = personalNumber;
    }
}
