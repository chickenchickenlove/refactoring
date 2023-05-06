package me.whiteship.refactoring._19_insider_trading.after;

import java.time.LocalDate;

public class Ticket {

    private LocalDate purchasedDate;
    private boolean prime;

    public Ticket(LocalDate purchasedDate, boolean prime) {
        this.purchasedDate = purchasedDate;
        this.prime = prime;
    }

    public LocalDate getPurchasedDate() {
        return purchasedDate;
    }

    public boolean isPrime() {
        return prime;
    }

    public boolean isFastPass() {
        // CheckIn 클래스에서 내부자 거래를 리팩토링해서 이 클래스로 이동된 메서드다.
        LocalDate earlyBirdDate = LocalDate.of(2022, 1, 1);
        return isPrime() && getPurchasedDate().isBefore(earlyBirdDate);
    }
}
