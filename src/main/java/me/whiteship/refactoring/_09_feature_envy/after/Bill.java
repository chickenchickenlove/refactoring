package me.whiteship.refactoring._09_feature_envy.after;

public class Bill {

    private ElectricityUsage electricityUsage;
    private GasUsage gasUsage;

    // Bill 클래스가 electiryUsage / GasUsage의 메서드를 많이 참조한다. (심지어 자기것은 없음)
    // 기능 편애의 냄새가 난다.
    public double calculateBill() {
        // 메서드로 뽑아서 옮기자.
        return electricityUsage.getElecticityBill() + gasUsage.getGasBill();
    }
}
