package me.whiteship.refactoring._18_middle_man._40_replace_subclass_with_delegate.after2;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Booking {

    protected Show show;
    protected LocalDateTime time;
    protected PremiumDelegate delegate;

    protected Booking(Show show, LocalDateTime time) {
        this.show = show;
        this.time = time;
    }

    public static Booking createBooking(Show show, LocalDateTime time) {
        return new Booking(show, time);
    }

    public static Booking createPremiumBooking(Show show, LocalDateTime time, PremiumExtra extra) {
        Booking booking = new Booking(show, time);
        booking.delegate = new PremiumDelegate(booking, extra);
        return booking;
    }


    public boolean hasTalkback() {
        return (this.delegate != null) ? this.delegate.hasTalkback() :
                this.show.hasOwnProperty("talkback") && !this.isPeakDay();
    }

    protected boolean isPeakDay() {
        DayOfWeek dayOfWeek = this.time.getDayOfWeek();
        return dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY;
    }

    public double basePrice() {
        double result = this.show.getPrice();
        if (this.isPeakDay()) result += Math.round(result * 0.15);
        return (this.delegate != null) ? this.delegate.extendBasePrice(result) : result;
    }

    public boolean hasDinner() {
        return (this.delegate != null) ? this.delegate.hasDinner() : false;
    }

    public static void main(String[] args) {

        String A = "a";
        String B = "b";
        System.out.println(A);
        System.out.println(B.toString());

    }
}
