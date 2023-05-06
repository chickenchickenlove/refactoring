package me.whiteship.refactoring._19_insider_trading;

import java.time.LocalDate;

public class CheckIn {

    public boolean isFastPass(Ticket ticket) {
        // isFastPass() 메서드는 ticket의 내부 정보(메서드)를 너무 많이 알고, 그것만 알고 있다.
        // 내부자 거래에 해당한다. (CheckIn이 Ticket에 강하게 의존함)
        LocalDate earlyBirdDate = LocalDate.of(2022, 1, 1);
        return ticket.isPrime() && ticket.getPurchasedDate().isBefore(earlyBirdDate);
    }
}
