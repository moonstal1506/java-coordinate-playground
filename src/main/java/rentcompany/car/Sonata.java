package rentcompany.car;

public class Sonata extends Car {

    private final String name;
    private static final double distancePerLiter = 10;

    public Sonata(int tripDistance) {
        super(tripDistance, distancePerLiter);
        this.name = "Sonata";
    }

    @Override
    public String getName() {
        return name;
    }
}
