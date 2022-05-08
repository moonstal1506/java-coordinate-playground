package coordinate.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FigureFactory {

    private final static Map<Integer, Function<List<Point>,Figure>> map = new HashMap<>();

    static{
        map.put(Line.POINTS_SIZE_OF_LINE, Line::new);
        map.put(Triangle.POINTS_SIZE_OF_TRIANGLE, Triangle::new);
        map.put(Rectangle.POINTS_SIZE_OF_RECTANGLE, Rectangle::new);
    }

    public static Figure create(List<Point> points) {
        return map.get(points.size()).apply(points);
    }

}
