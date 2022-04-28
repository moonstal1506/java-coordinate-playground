package coordinate;

import coordinate.model.Point;
import coordinate.view.InputView;

import java.util.ArrayList;
import java.util.List;

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

            System.out.println("두점사이의 거리는"+distance);
        }
    }
}
