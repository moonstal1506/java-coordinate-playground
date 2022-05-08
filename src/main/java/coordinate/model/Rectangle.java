package coordinate.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class Rectangle extends Figure {

    public static final int POINTS_SIZE_OF_RECTANGLE = 4;
    private static final int SET_SIZE = 2;
    private static final String AREA_OF_RECTANGLE = "사각형 넓이는 ";
    private Set<Integer> xSet;
    private Set<Integer> ySet;

    public Rectangle(List<Point> points) {
        super(points);
        checkRectangle(points);
    }

    private void checkRectangle(List<Point> points) {
        xSet = xyToSet(points, Point::getX);
        ySet = xyToSet(points, Point::getY);

        if (!(isRectangle(xSet) && isRectangle(ySet))) {
            throw new IllegalArgumentException("사각형이 아닙니다.");
        }
    }

    private Set<Integer> xyToSet(List<Point> points, Function<Point, Integer> function) {
        return points.stream().map(function).collect(toSet());
    }

    private boolean isRectangle(Set<Integer> set) {
        return set.size() == SET_SIZE;
    }

    @Override
    public double area() {
        return calculateDistance(xSet) * calculateDistance(ySet);
    }

    private static int calculateDistance(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set);
        return Math.abs(list.get(0) - list.get(1));
    }

    @Override
    public String reportArea() {
        return AREA_OF_RECTANGLE + area();
    }
}
