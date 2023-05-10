package me.whiteship.refactoring._16_temporary_field._36_introduce_special_case.after1;

public class UnknownCustomer extends Customer{
    public UnknownCustomer() {
        super("occupant", new BasicBillingPlan(), new NullPaymentHistory());
    }

    @Override
    boolean isUnknown() {
        return true;
    }
}
