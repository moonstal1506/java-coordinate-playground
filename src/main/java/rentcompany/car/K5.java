package rentcompany.car;

public class K5 extends Car {

    private final String name;
    private static final double DISTANCE_PER_LITER = 13;

    public K5(int tripDistance) {
        super(tripDistance, DISTANCE_PER_LITER);
        this.name = "K5";
    }

    @Override
    public String getName() {
        return name;
    }
}
