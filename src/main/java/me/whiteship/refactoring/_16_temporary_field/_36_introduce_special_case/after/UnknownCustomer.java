package me.whiteship.refactoring._16_temporary_field._36_introduce_special_case.after;

public class UnknownCustomer extends Customer{

    public UnknownCustomer() {
        // 초기에는 billingPlan, paymentHistory를 모두 null로 가정한다.
        // default 생성자로 만든다.
        // super("unknown", null, null);

        // CustomerService의 billingPlan을 전달해줌.
        // super("occupant", new BasicBillingPlan(), null);

        // CustomerService의 weeksDelinquent()를 넘겨준다.
        super("occupant", new BasicBillingPlan(), new NullPaymentHistory());
    }

    @Override
    public boolean isUnknown() {
        return true;
    }
}
