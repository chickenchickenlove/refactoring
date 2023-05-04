package me.whiteship.refactoring._07_divergent_change._26_extract_class;

public class Person {

    private String name;

    // 아래 두 필드는 관련이 있다. 이것을 extract deligate로 빼보자.
    // 빼보면 어떤 메서드 / 필드가 함께 나가야하는지 알 수 있음.
    private String officeAreaCode;
    private String officeNumber;

    public String telephoneNumber() {
        return this.officeAreaCode + " " + this.officeNumber;
    }

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String officeAreaCode() {
        return officeAreaCode;
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.officeAreaCode = officeAreaCode;
    }

    public String officeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}
