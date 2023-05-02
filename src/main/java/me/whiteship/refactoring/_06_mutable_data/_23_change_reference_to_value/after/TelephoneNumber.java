package me.whiteship.refactoring._06_mutable_data._23_change_reference_to_value;

// 현재 TelephonNumber는 Value 객체가 아니다. Setter가 존재하기 때문에 언제든지 값이 변할 수 있기 때문이다. 
public class TelephoneNumber {

    private String areaCode;

    private String number;

    public String areaCode() {
        return areaCode;
    }

    public void areaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String number() {
        return number;
    }

    public void number(String number) {
        this.number = number;
    }
}
