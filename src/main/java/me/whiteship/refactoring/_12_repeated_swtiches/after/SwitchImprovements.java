package me.whiteship.refactoring._12_repeated_swtiches.after;

public class SwitchImprovements {

    // break가 없기 때문에 항상 0만 반환된다.
    public int vacationHours(String type) {
        int result = switch (type) {
            case "full-time" -> 120;
            case "part-time" -> 80;
            case "temporal" -> 32;
            default -> 0;
        };
    }
}
