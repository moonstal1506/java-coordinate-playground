package coordinate.model;

import java.util.List;
import java.util.Objects;

public class Line extends Figure{

    public static final int POINTS_SIZE_OF_LINE = 2;
    private static final String AREA_OF_LINE = "두 점 사이의 거리는 ";

    public Line(List<Point> points) {
        super.points = points;
    }

    @Override
    public double area(){
        return points.get(0).calculateDistance(points.get(1));
    }

    @Override
    public String reportArea() {
        return AREA_OF_LINE + area();
    }

}
