package me.whiteship.refactoring._08_shotgun_surgery._28_inline_function;

public class Rating {

    public int rating(Driver driver) {
        return moreThanFiveLateDeliveries(driver) ? 2 : 1;
    }

    // 메서드 이름만큼 수식도 메서드의 의미를 잘 표현한다.
    private boolean moreThanFiveLateDeliveries(Driver driver) {
        return driver.getNumberOfLateDeliveries() > 5;
    }
}
