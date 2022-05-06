package coordinate.model;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class Rectangle extends Figure{

    public static final int POINTS_SIZE_OF_RECTANGLE = 4;
    private static final int SET_SIZE = 2;

    public Rectangle(List<Point> points) {
        checkRectangle(points);
        super.points = points;
    }

    private void checkRectangle(List<Point> points){
        Set<Integer> xSet = xyToSet(points,Point::getX);
        Set<Integer> ySet = xyToSet(points,Point::getY);

        if(!(isRectangle(xSet) && isRectangle(ySet))){
            throw new IllegalArgumentException("사각형이 아닙니다.");
        }
    }

    private Set<Integer> xyToSet(List<Point> points, Function<Point,Integer> function) {
        return points.stream().map(function).collect(toSet());
    }

    private boolean isRectangle(Set<Integer> xSet) {
        return xSet.size() == SET_SIZE;
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
