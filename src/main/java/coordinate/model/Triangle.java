package coordinate.model;

import java.util.List;

public class Triangle extends Figure{

    public static final int POINTS_SIZE_OF_TRIANGLE = 3;
    private static final String AREA_OF_TRIANGLE = "삼각형 넓이는 ";

    public Triangle(List<Point> points) {
        super(points);
    }

    @Override
    public double area() {
        List<Point> points = getPoints();
        Point a = points.get(0);
        Point b = points.get(1);
        Point c = points.get(2);

        double distanceAB = a.calculateDistance(b);
        double distanceBC = b.calculateDistance(c);
        double distanceAC = c.calculateDistance(a);
        double s = (distanceAB + distanceBC + distanceAC) / 2;

        return Math.sqrt(s * (s - distanceAB) * (s - distanceBC) * (s - distanceAC));
    }

    @Override
    public String reportArea() {
        return AREA_OF_TRIANGLE + area();
    }
}
