package rentcompany;

public class K5 extends Car {

    private final String name;
    private final int distancePerLiter;
    private int tripDistance;

    public K5(int tripDistance) {
        this.tripDistance = tripDistance;
        this.distancePerLiter = 13;
        this.name = "K5";
    }

    @Override
    double getDistancePerLiter() {
        return distancePerLiter;
    }

    @Override
    double getTripDistance() {
        return tripDistance;
    }

    @Override
    String getName() {
        return name;
    }
}
