package me.whiteship.refactoring._06_mutable_data._21_replace_derived_variable_with_query;

public class Discount {

    private double discountedTotal;
    private double discount;
    private double baseTotal;

    public Discount(double baseTotal) {
        this.baseTotal = baseTotal;
    }

    public double getDiscountedTotal() {
        return this.discountedTotal;
    }

    // discountedTotal은 baseTotal, discount를 이용한 계산을 통해 생성되는 값이다. → 파생변수.
    // 또한 discount가 가변 값이기 때문에 가변 파생변수인 discountedTotal을 제거해야한다.
    public void setDiscount(double number) {
        this.discount = number;
        this.discountedTotal = this.baseTotal - this.discount;
    }
}
