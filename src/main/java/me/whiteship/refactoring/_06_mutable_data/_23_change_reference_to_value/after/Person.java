package me.whiteship.refactoring._06_mutable_data._23_change_reference_to_value.after;

public class Person {

    private TelephoneNumber officeTelephoneNumber;

    public String officeAreaCode() {
        return this.officeTelephoneNumber.areaCode();
    }

    public void officeAreaCode(String areaCode) {
        //this.officeTelephoneNumber.areaCode(areaCode);
        // 사용하는 쪽에서는 세터가 없으니, 새로운 객체를 만들어서 사용해야 한다.
        this.officeTelephoneNumber = new TelephoneNumber(areaCode, this.officeNumber());
    }

    public String officeNumber() {
        return this.officeTelephoneNumber.number();
    }

    public void officeNumber(String number) {
        // this.officeTelephoneNumber.number(number);
        // 사용하는 쪽에서는 세터가 없으니, 새로운 객체를 만들어서 사용해야 한다.
        this.officeTelephoneNumber = new TelephoneNumber(this.officeAreaCode(), number);
    }
}
