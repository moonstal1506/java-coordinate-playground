package coordinate.model;

import java.util.List;
import java.util.Objects;

public class Line extends Figure{

    public static final int POINTS_SIZE_OF_LINE = 2;

    public Line(List<Point> points) {
        super.points = points;
    }

    @Override
    public double area(){
        return points.get(0).calculateDistance(points.get(1));
    }

}
