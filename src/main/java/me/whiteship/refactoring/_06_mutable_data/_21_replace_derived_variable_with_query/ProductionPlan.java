package me.whiteship.refactoring._06_mutable_data._21_replace_derived_variable_with_query;

import java.util.ArrayList;
import java.util.List;

public class ProductionPlan {

    private double production;
    private List<Double> adjustments = new ArrayList<>();

    // production 변수는 미리 계산할 필요가 없다.
    // adjustment에 모두 포함되어 있는 값이며, 거기서 파생되는 가변 파생 변수이기 때문이다.
    public void applyAdjustment(double adjustment) {
        this.adjustments.add(adjustment);
        this.production += adjustment;
    }

    public double getProduction() {
        return this.production;
    }
}
