package coordinate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FigureFactory {

    private final static Map<Integer, FigureCreator> map = new HashMap<>();

    static {
        map.put(2, Line::new);
        map.put(3, Triangle::new);
        map.put(4, Rectangle::new);
    }

    static Figure getInstance(List<Point> points) {
        FigureCreator figureCreator = map.get(points.size());
        return figureCreator.create(points);
    }
}
