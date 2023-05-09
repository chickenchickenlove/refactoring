package me.whiteship.refactoring._24_comments._43_introduce_assertion;

// discountRate는 음수가 아님을 가정한다.
// 이 전제조건은 현재 어디에도 표현되어 있지 않다.
// 전제 조건을 주석으로 작성하는 것보다는 assert 문으로 표현해주는 것이 좋다.
public class Customer {

    private Double discountRate;

    public double applyDiscount(double amount) {
        return (this.discountRate != null) ? amount - (this.discountRate * amount) : amount;
    }

    public Double getDiscountRate() {
        return discountRate;
    }


    public void setDiscountRate(Double discountRate) {
        this.discountRate = discountRate;
    }
}
