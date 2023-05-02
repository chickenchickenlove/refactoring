package me.whiteship.refactoring._06_mutable_data._23_change_reference_to_value.after;

import java.util.Objects;

// 현재 TelephonNumber는 Value 객체가 아니다. Setter가 존재하기 때문에 언제든지 값이 변할 수 있기 때문이다.
// 1. final 필드로 설정 / 2. Setter 제거. / 3. equals + hashcode() 오버라이딩.
public class TelephoneNumber {

    private final String areaCode;

    private final String number;

    public TelephoneNumber(String areaCode, String number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    public String areaCode() {
        return areaCode;
    }

    public String number() {
        return number;
    }

    // 값 객체를 위한 equals, hashCode 정의
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TelephoneNumber that = (TelephoneNumber) o;
        return Objects.equals(areaCode, that.areaCode) && Objects.equals(number, that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, number);
    }
}
