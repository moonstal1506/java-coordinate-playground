package rentcompany;

public class Avante extends Car {

    private final String name;
    private final int distancePerLiter;
    private int tripDistance;

    public Avante(int tripDistance) {
        this.tripDistance = tripDistance;
        this.distancePerLiter = 15;
        this.name = "Avante";
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
