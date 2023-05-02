package me.whiteship.refactoring._06_mutable_data._18_split_variable.after;

public class Order {

    // inputValue 변수는 입력값과 반환값을 동시에 의미함. (재할당됨)
    public double discount(double inputValue, int quantity) {
        double result = inputValue;

        if (inputValue > 50) result -= 2;
        if (quantity > 100) result -= 1;

        return result;
    }
}
