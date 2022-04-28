package rentcompany.car;

public class Avante extends Car {

    private final String name;
    private static final double distancePerLiter = 15;

    public Avante(int tripDistance) {
        super(tripDistance, distancePerLiter);
        this.name = "Avante";
    }

    @Override
    public String getName() {
        return name;
    }
}
