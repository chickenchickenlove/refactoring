package me.whiteship.refactoring._07_divergent_change._26_extract_class.after;

public class TelephoneNumber {

    // 필드이름이 TelephoneNumber 클래스에 걸맞지 않다.
    private String areaCode;
    private String phoneNumber;

    public TelephoneNumber(String areaCode, String phoneNumber) {
        this.areaCode = areaCode;
        this.phoneNumber = phoneNumber;
    }



    public String officeAreaCode() {
        return this.areaCode;
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        this.areaCode = officeAreaCode;
    }

    public String officeNumber() {
        return this.phoneNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.phoneNumber = officeNumber;
    }

    @Override
    public String toString() {
        return this.areaCode + " " + this.phoneNumber;
    }
}