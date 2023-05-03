package me.whiteship.refactoring._10_data_clumps.after;

public class TelephoneNumber {

    private String areaCode;
    private String phoneNumber;

    public TelephoneNumber(String areaCode, String phoneNumber) {
        this.areaCode = areaCode;
        this.phoneNumber = phoneNumber;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String phoneNumber() {
        return this.areaCode + "-" + this.phoneNumber;
    }
}
