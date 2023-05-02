package me.whiteship.refactoring._06_mutable_data._19_separate_query_from_modifier;

import java.util.List;

public class Criminal {

    // 1. Don, John인지를 조회
    // 2. 맞는 경우 알람 끄기
    // 조회 + 업데이트 두 가지 작업을 하는 중 → 명령 + 조회로 분리가 필요함.
    public String alertForMiscreant(List<Person> people) {
        for (Person p : people) {
            if (p.getName().equals("Don")) {
                setOffAlarms();
                return "Don";
            }

            if (p.getName().equals("John")) {
                setOffAlarms();
                return "John";
            }
        }

        return "";
    }

    private void setOffAlarms() {
        System.out.println("set off alarm");
    }
}
