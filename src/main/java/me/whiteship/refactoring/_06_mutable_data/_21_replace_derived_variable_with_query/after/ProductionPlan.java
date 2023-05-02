package me.whiteship.refactoring._06_mutable_data._21_replace_derived_variable_with_query.after;

import java.util.ArrayList;
import java.util.List;

public class ProductionPlan {

    // 가변 파생 인수 제거
    // private double production;
    private List<Double> adjustments = new ArrayList<>();

    public void applyAdjustment(double adjustment) {
        this.adjustments.add(adjustment);
    }

    public double getProduction() {
        // assert this.production == calculatedProduction(); // 수식 검증 후, 맞으면 제거
        return adjustments.stream().mapToDouble(value -> value).sum();
    }

    // 수식 검증을 위한 메서드
    /*private double calculatedProduction() {
        return adjustments.stream().mapToDouble(value -> value).sum();
    }*/
}
