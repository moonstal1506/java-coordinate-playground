package rentcompany.car;

public class Avante extends Car {

    private final String name;
    private static final double DISTANCE_PER_LITER = 15;

    public Avante(int tripDistance) {
        super(tripDistance, DISTANCE_PER_LITER);
        this.name = "Avante";
    }

    @Override
    public String getName() {
        return name;
    }
}
