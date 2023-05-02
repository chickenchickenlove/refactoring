package me.whiteship.refactoring._06_mutable_data._22_combine_functions_into_transform.after;

public class Client2 extends ReadingClient {

    private double base;
    private double taxableCharge;

    // baseCharge : 가변 파생 필드. 여기저기서 사용됨.
    // taxableCharge : 가변 파생 필드. 여기저기서 사용됨.
    public Client2(Reading reading) {
        this.base = enrichingReading(reading).baseCharge();
        this.taxableCharge = enrichingReading(reading).taxableCharge();
    }

    public double getBase() {
        return this.base;
    }

    public double getTaxableCharge() {
        return this.taxableCharge;
    }
}
