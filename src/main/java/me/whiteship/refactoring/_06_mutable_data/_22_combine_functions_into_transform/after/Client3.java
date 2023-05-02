package me.whiteship.refactoring._06_mutable_data._22_combine_functions_into_transform.after;

public class Client3 extends ReadingClient {

    private double basicChargeAmount;

    // basicChargeAmount : 가변 인수. 여기저기서 사용되고 있으며, baseCharge와 동일한 계산식으로 생성됨.
    public Client3(Reading reading) {
        this.basicChargeAmount = enrichingReading(reading).baseCharge();
    }

    public double getBasicChargeAmount() {
        return this.basicChargeAmount;
    }
}
