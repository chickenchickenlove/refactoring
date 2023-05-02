package me.whiteship.refactoring._06_mutable_data._19_separate_query_from_modifier;

public class Billing {

    private Customer customer;

    private EmailGateway emailGateway;

    public Billing(Customer customer, EmailGateway emailGateway) {
        this.customer = customer;
        this.emailGateway = emailGateway;
    }

    // Total 값을 조회 + 영수증 전송 --> 조회 + 수정을 동시에 하는 중. 냄새 분리 필요.
    public double getTotalOutstandingAndSendBill() {
        double result = customer.getInvoices().stream()
                .map(Invoice::getAmount)
                .reduce((double) 0, Double::sum);
        sendBill();
        return result;
    }

    private void sendBill() {
        emailGateway.send(formatBill(customer));
    }

    private String formatBill(Customer customer) {
        return "sending bill for " + customer.getName();
    }
}
