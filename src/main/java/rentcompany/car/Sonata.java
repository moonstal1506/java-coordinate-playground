package rentcompany.car;

public class Sonata extends Car {

    private final String name;
    private static final double DISTANCE_PER_LITER = 10;

    public Sonata(int tripDistance) {
        super(tripDistance, DISTANCE_PER_LITER);
        this.name = "Sonata";
    }

    @Override
    public String getName() {
        return name;
    }
}
