package me.whiteship.refactoring._08_shotgun_surgery._28_inline_function.after;

public class Rating {

    public int rating(Driver driver) {
        return driver.getNumberOfLateDeliveries() > 5 ?
                2 : 1;
    }
}
