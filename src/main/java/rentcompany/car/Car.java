package rentcompany.car;

public abstract class Car implements CarInterface {

    private final double tripDistance;
    private final double distancePerLiter;

    public Car(double tripDistance, double distancePerLiter) {
        this.tripDistance = tripDistance;
        this.distancePerLiter = distancePerLiter;
    }

    public double getChargeQuantity() {
        return tripDistance / distancePerLiter;
    }
}
