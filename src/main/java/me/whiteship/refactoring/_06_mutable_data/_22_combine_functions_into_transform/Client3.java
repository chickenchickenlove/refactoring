package me.whiteship.refactoring._06_mutable_data._22_combine_functions_into_transform;

import java.time.Month;
import java.time.Year;

public class Client3 {

    private double basicChargeAmount;

    // basicChargeAmount : 가변 인수. 여기저기서 사용되고 있으며, baseCharge와 동일한 계산식으로 생성됨.
    public Client3(Reading reading) {
        this.basicChargeAmount = calculateBaseCharge(reading);
    }

    private double calculateBaseCharge(Reading reading) {
        return baseRate(reading.month(), reading.year()) * reading.quantity();
    }

    private double baseRate(Month month, Year year) {
        return 10;
    }

    public double getBasicChargeAmount() {
        return basicChargeAmount;
    }
}
