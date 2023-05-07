package me.whiteship.refactoring._15_speculative_generality._35_remove_dead_code;

import java.time.LocalDateTime;

// 인텔리제이에서 제공하는 usages를 보고, 0인 경우는 삭제한다.
public class Reservation {

    private String title;

    private LocalDateTime from;

    private LocalDateTime to;

    private LocalDateTime alarm;

    public Reservation(String title, LocalDateTime from, LocalDateTime to) {
        this.title = title;
        this.from = from;
        this.to = to;
    }

    public void setAlarmBefore(int minutes) {
        this.alarm = this.from.minusMinutes(minutes);
    }

    public LocalDateTime getAlarm() {
        return alarm;
    }
}
