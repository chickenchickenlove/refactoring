package me.whiteship.refactoring._20_large_class._41_extract_superclass;

import java.util.List;

// Department, Employee 비슷한 코드가 있다. 따라서 슈퍼클래스로 추출하기를 통해 중복 코드 제거 가능.
// 1. 월간 비용 + 연간 비용 지불
// 2. 이름
public class Department {

    private String name;

    private List<Employee> staff;

    public String getName() {
        return name;
    }

    public List<Employee> getStaff() {
        return staff;
    }

    public double totalMonthlyCost() {
        return this.staff.stream().mapToDouble(e -> e.getMonthlyCost()).sum();
    }

    public double totalAnnualCost() {
        return this.totalMonthlyCost() * 12;
    }

    public int headCount() {
        return this.staff.size();
    }
}
