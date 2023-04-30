package me.whiteship.refactoring._03_long_function._09_preserve_whole_object.after;

import java.util.HashMap;
import java.util.Map;

public record Participant(String username, Map<Integer, Boolean> homework) {
    public Participant(String username) {
        this(username, new HashMap<>());
    }
    public void setHomeworkDone(int index) {
        this.homework.put(index, true);
    }

    // 도메인 객체쪽으로 캡슐화 한다.
    public double getRate(int totalNumberOfEvents) {
        long count = this.homework.values().stream()
                .filter(v -> v == true)
                .count();
        return (double) (count * 100 / totalNumberOfEvents);
    }
}
