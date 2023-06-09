package me.whiteship.refactoring._06_mutable_data._19_separate_query_from_modifier.after;

import java.util.List;

public class Criminal {

    // 1. Don, John인지를 조회
    // 2. 맞는 경우 알람 끄기
    // 조회 + 업데이트 두 가지 작업을 하는 중 → 명령 + 조회로 분리가 필요함.
    // 업데이트 메서드 (명령 메서드)
    public void alertForMiscreant(List<Person> people) {
        for (Person p : people) {
            if (p.getName().equals("Don")) {
                setOffAlarms();
            }

            if (p.getName().equals("John")) {
                setOffAlarms();
            }
        }
    }

    // 단순 조회 메서드 (쿼리 메서드)
    public String findMiscreant(List<Person> people) {
        for (Person p : people) {
            if (p.getName().equals("Don")) {
                return "Don";
            }

            if (p.getName().equals("John")) {
                return "John";
            }
        }

        return "";
    }

    private void setOffAlarms() {
        System.out.println("set off alarm");
    }
}
