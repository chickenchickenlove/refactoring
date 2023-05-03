package me.whiteship.refactoring._08_shotgun_surgery._27_move_field;

import java.math.BigDecimal;
import java.time.LocalDate;

// 추후 DiscountRate는 CustomerContract에서 계산되는 것이 더 타당하다.
public class Customer {

    private String name;

    private double discountRate;

    private CustomerContract contract;

    public Customer(String name, double discountRate) {
        this.name = name;
        this.discountRate = discountRate;
        this.contract = new CustomerContract(dateToday());
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void becomePreferred() {
        // 필드에 직접 접근하는 부분을 모두 getter / setter로 감싼다
        this.discountRate += 0.03;
        // 다른 작업들
    }

    public double applyDiscount(double amount) {
        BigDecimal value = BigDecimal.valueOf(amount);
        // 필드에 직접 접근하는 부분을 모두 getter / setter로 감싼다.
        return value.subtract(value.multiply(BigDecimal.valueOf(this.discountRate))).doubleValue();
    }

    private LocalDate dateToday() {
        return LocalDate.now();
    }
}
