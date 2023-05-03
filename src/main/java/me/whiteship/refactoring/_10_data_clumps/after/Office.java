package me.whiteship.refactoring._10_data_clumps.after;

public class Office {

    private String location;

    // areaCode + Number가 함께 사용됨.
    // Office 클래스에도 존재함.
    private TelephoneNumber officePhoneNumber;

    public Office(String location, TelephoneNumber officePhoneNumber) {
        this.location = location;
        this.officePhoneNumber = officePhoneNumber;
    }
}
