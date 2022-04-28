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

            double distance = Math.sqrt(Math.pow(a.getX() - b.getX(), 2) +
                    (Math.pow(a.getY() - b.getY(), 2)));

            System.out.println("두점사이의 거리는" + distance);
        }


        if (points.size() == 4) {
            Set<Integer> xSet = getSet(points,Point::getX);
            Set<Integer> ySet = getSet(points,Point::getY);

            if(!(xSet.size()==2&&ySet.size()==2)){
                throw new IllegalArgumentException("직사각형 아님");
            }

            int areaSize=calculateDistance(xSet)*calculateDistance(ySet);
            System.out.println("사각형 넓이는 " + areaSize);
        }
    }

    private static Set<Integer> getSet(List<Point> points, Function<Point, Integer> function) {
        return points.stream()
                .map(function)
                .collect(toSet());
    }

    private static int calculateDistance(Set<Integer> set){
        List<Integer> list = new ArrayList<>(set);
        return Math.abs(list.get(0)-list.get(1));
    }
}
