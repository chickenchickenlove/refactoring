package me.whiteship.refactoring._09_feature_envy.after;

public class GasUsage {

    private double amount;

    private double pricePerUnit;

    public GasUsage(double amount, double pricePerUnit) {
        this.amount = amount;
        this.pricePerUnit = pricePerUnit;
    }

    public double getGasBill() {
        return this.getAmount() * this.getPricePerUnit();
    }
    public double getAmount() {
        return amount;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
}
