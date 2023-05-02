package me.whiteship.refactoring._06_mutable_data._18_split_variable.after;

public class Haggis {

    private double primaryForce;
    private double secondaryForce;
    private double mass;
    private int delay;

    public Haggis(double primaryForce, double secondaryForce, double mass, int delay) {
        this.primaryForce = primaryForce;
        this.secondaryForce = secondaryForce;
        this.mass = mass;
        this.delay = delay;
    }

    // acc가 서로 다른 의미를 가지고 있는데, 여러 번 재할당 됨.
    // result는 축적의 의미를 가지고 있으므로 괜찮음.
    public double distanceTravelled(int time) {
        double result;
        final double PrimaryAcceleration = primaryForce / mass;
        final int primaryTime = Math.min(time, delay);
        result = 0.5 * PrimaryAcceleration * primaryTime * primaryTime;

        int secondaryTime = time - delay;
        if (secondaryTime > 0) {
            final double primaryVelocity = PrimaryAcceleration * delay;
            final double secondaryAcceleration = (primaryForce + secondaryForce) / mass;
            result += primaryVelocity * secondaryTime + 0.5 * secondaryAcceleration * secondaryTime + secondaryTime;
        }

        return result;
    }
}
