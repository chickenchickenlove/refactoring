package me.whiteship.refactoring._08_shotgun_surgery._29_inline_class;

public class Shipment {

    // 이 필드는 이제 삭제된다. 왜냐하면 해당 클래스가 Shipment로 합쳐지기 때문임.
    private TrackingInformation trackingInformation;

    public Shipment(TrackingInformation trackingInformation) {
        this.trackingInformation = trackingInformation;
    }

    public TrackingInformation getTrackingInformation() {
        return trackingInformation;
    }

    public void setTrackingInformation(TrackingInformation trackingInformation) {
        this.trackingInformation = trackingInformation;
    }

    public String getTrackingInfo() {
        return this.trackingInformation.display();
    }
}
