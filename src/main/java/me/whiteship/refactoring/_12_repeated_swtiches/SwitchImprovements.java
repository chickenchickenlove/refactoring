package me.whiteship.refactoring._12_repeated_swtiches;

public class SwitchImprovements {

    // break가 없기 때문에 항상 0만 반환된다.
    public int vacationHours(String type) {
        int result;
        switch (type) {
            case "full-time": result = 120;
            case "part-time": result = 80;
            case "temporal": result = 32;
            default: result = 0;
        }
        return result;
    }
}
