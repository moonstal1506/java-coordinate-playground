package coordinate.model;

import java.util.List;

public class Triangle extends Figure{

    public static final int POINTS_SIZE_OF_TRIANGLE = 3;

    public Triangle(List<Point> points) {
        super.points = points;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public String reportArea() {
        return null;
    }
}
