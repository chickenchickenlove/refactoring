package me.whiteship.refactoring._04_long_parameter_list._14_replace_parameter_with_query;

public class Order {

    private int quantity;

    private double itemPrice;

    public Order(int quantity, double itemPrice) {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public double finalPrice() {
        double basePrice = this.quantity * this.itemPrice;
        // 이 수식은 이해하기 어려움. 의미를 가진 메서드로 빼야할 듯
        int discountLevel = this.quantity > 100 ? 2 : 1;
        return this.discountedPrice(basePrice, discountLevel);
    }

    // basePrice, discountLevel이 있음.
    private double discountedPrice(double basePrice, int discountLevel) {
        return discountLevel == 2 ? basePrice * 0.90 : basePrice * 0.95;
    }
}
