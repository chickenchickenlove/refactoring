package me.whiteship.refactoring._07_divergent_change._24_split_phase;

public class PriceOrder {

    // 코드가 너무 복잡하다.
    // 1. basePrice 구함.
    // 2. shipping 비용을 구함.
    // 코드를 나누는 과정에서 중간 단계의 변수를 만들고, 이것을 매개변수로 전달해준다.
    public double priceOrder(Product product, int quantity, ShippingMethod shippingMethod) {
        final double basePrice = product.basePrice() * quantity;
        final double discount = Math.max(quantity - product.discountThreshold(), 0)
                * product.basePrice() * product.discountRate();
        final double shippingPerCase = (basePrice > shippingMethod.discountThreshold()) ?
                shippingMethod.discountedFee() : shippingMethod.feePerCase();
        final double shippingCost = quantity * shippingPerCase;
        final double price = basePrice - discount + shippingCost;
        return price;
    }
}
