package coordinate.model;

import java.util.List;

public class FigureFactory {

    public static Figure create(List<Point> points) {
        if (points.size() == Line.POINTS_SIZE_OF_LINE) {
            return new Line(points);
        }
        if (points.size() == Rectangle.POINTS_SIZE_OF_RECTANGLE) {
            return new Rectangle(points);
        }
        if (points.size() == Triangle.POINTS_SIZE_OF_TRIANGLE) {
            return new Triangle(points);
        }
        throw new IllegalArgumentException();
    }

}
