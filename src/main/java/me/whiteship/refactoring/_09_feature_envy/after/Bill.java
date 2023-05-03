package me.whiteship.refactoring._09_feature_envy;

public class Bill {

    private ElectricityUsage electricityUsage;

    private GasUsage gasUsage;

    // Bill 클래스가 electiryUsage / GasUsage의 메서드를 많이 참조한다. (심지어 자기것은 없음)
    // 기능 편애의 냄새가 난다.
    public double calculateBill() {
        var electicityBill = electricityUsage.getAmount() * electricityUsage.getPricePerUnit();
        var gasBill = gasUsage.getAmount() * gasUsage.getPricePerUnit();
        return electicityBill + gasBill;
    }

}
