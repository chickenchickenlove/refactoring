package me.whiteship.refactoring._18_middle_man._40_replace_subclass_with_delegate.after;

import java.time.LocalDateTime;

public class PremiumBooking extends Booking {

    private PremiumExtra extra;

    public PremiumBooking(Show show, LocalDateTime time, PremiumExtra extra) {
        super(show, time);
        this.extra = extra;
    }


    public boolean hasDinner() {
        return this.extra.hasOwnProperty("dinner") && !this.isPeakDay();
    }
}
