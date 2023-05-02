package me.whiteship.refactoring._06_mutable_data._22_combine_functions_into_transform.after;

public class Client1 extends ReadingClient{

    private double base;

    // baseCharge : 가변 파생 필드. 여기저기서 사용됨.
    public Client1(Reading reading) {
        this.base = enrichingReading(reading).baseCharge();
    }

    public double getBaseCharge() {
        return this.base;
    }
}
