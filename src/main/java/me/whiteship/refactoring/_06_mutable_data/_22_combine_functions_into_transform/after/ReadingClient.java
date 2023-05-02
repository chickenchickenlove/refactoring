package me.whiteship.refactoring._06_mutable_data._22_combine_functions_into_transform.after;

import java.time.Month;
import java.time.Year;

public class ReadingClient {

    private double taxThreshold(Year year) {
        return 5;
    }

    private double baseRate(Month month, Year year) {
        return 10;
    }

    // EnrichingReading 인스턴스 생성
    protected EnrichingReading enrichingReading(Reading reading) {
        return new EnrichingReading(reading,
                calculatedBaseCharge(reading),
                calculatedTaxableCharge(reading));
    }

    private double calculatedBaseCharge(Reading reading) {
        return baseRate(reading.month(), reading.year());
    }

    private double calculatedTaxableCharge(Reading reading) {
        return Math.max(0, this.calculatedBaseCharge(reading) - taxThreshold(reading.year()));
    }
}
