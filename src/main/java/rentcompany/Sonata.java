package rentcompany;

public class Sonata extends Car {

    private final String name;
    private final int distancePerLiter;
    private int tripDistance;

    public Sonata(int tripDistance) {
        this.tripDistance = tripDistance;
        this.distancePerLiter = 10;
        this.name = "Sonata";
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
