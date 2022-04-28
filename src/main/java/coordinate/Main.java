package coordinate;

import coordinate.model.Point;
import coordinate.view.InputView;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

import static java.util.stream.Collectors.toSet;

public class Main {
    public static void main(String[] args) {

        InputView inputView = new InputView();
        String value = inputView.input();
        String[] StringPoints = value.split("-");
        List<Point> points = new ArrayList<>();
        for (String StringPoint : StringPoints) {
            String[] xy = StringPoint.substring(1, StringPoint.length() - 1).split(",");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            points.add(new Point(x, y));
        }

        if (points.size() == 2) {
            Point a = points.get(0);
            Point b = points.get(1);

            System.out.println("두점사이의 거리는" + calculatePointsDistance(a, b));
        }

        if (points.size() == 3) {
            Point a = points.get(0);
            Point b = points.get(1);
            Point c = points.get(2);

            double distanceAB = calculatePointsDistance(a, b);
            double distanceBC = calculatePointsDistance(b, c);
            double distanceAC = calculatePointsDistance(a, c);

            double s = (distanceAB + distanceBC + distanceAC) / 2;
            double area = Math.sqrt(s * (s - distanceAB) * (s - distanceBC) * (s - distanceAC));

            System.out.println("삼각형 넓이는 " + area);
        }

        if (points.size() == 4) {
            Set<Integer> xSet = getSet(points, Point::getX);
            Set<Integer> ySet = getSet(points, Point::getY);

            if (!(xSet.size() == 2 && ySet.size() == 2)) {
                throw new IllegalArgumentException("직사각형 아님");
            }

            int area = calculatePointDistance(xSet) * calculatePointDistance(ySet);
            System.out.println("사각형 넓이는 " + area);
        }
    }

    private static double calculatePointsDistance(Point point1, Point point2) {
        return Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) +
                (Math.pow(point1.getY() - point2.getY(), 2)));
    }

    private static Set<Integer> getSet(List<Point> points, Function<Point, Integer> function) {
        return points.stream()
                .map(function)
                .collect(toSet());
    }

    private static int calculatePointDistance(Set<Integer> set) {
        List<Integer> list = new ArrayList<>(set);
        return Math.abs(list.get(0) - list.get(1));
    }
}
