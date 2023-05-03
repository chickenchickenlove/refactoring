package me.whiteship.refactoring._08_shotgun_surgery._29_inline_class.after;

public class Shipment {

    // 이 필드는 이제 삭제된다. 왜냐하면 해당 클래스가 Shipment로 합쳐지기 때문임.
    // private TrackingInformation trackingInformation;
    // 필드를 먼저 옮김 + 생성자 새롭게 생성
    private String shippingCompany;
    private String trackingNumber;

    public Shipment(String shippingCompany, String trackingNumber) {
        this.shippingCompany = shippingCompany;
        this.trackingNumber = trackingNumber;
    }

    public String display() {
        return this.shippingCompany + ": " + this.trackingNumber;
    }

    public String getShippingCompany() {
        return this.shippingCompany;
    }

    public void setShippingCompany(String shippingCompany) {
        this.shippingCompany = shippingCompany;
    }

    public String getTrackingNumber() {
        return this.trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }
}
