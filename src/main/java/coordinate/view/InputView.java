package coordinate.view;

import coordinate.model.Figure;
import coordinate.model.FigureFactory;
import coordinate.model.Line;
import coordinate.model.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {

    private static final String POINTS_DELIMITER = "-";
    private static final String POINT_DELIMITER = ",";
    private static final String INPUT_MESSAGE = "좌표를 입력하세요.";
    static Scanner scanner = new Scanner(System.in);

    public static Figure input(){
        System.out.println(INPUT_MESSAGE);
        return input(scanner.nextLine());
    }

    public static Figure input(String value){
        try {
            return new FigureFactory().create(createPoints(value));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return input();
        }
    }



    private static List<Point> createPoints(String value) {
        List<Point> points = new ArrayList<>();
        for (String StringPoint : splitPoints(value)) {
            String[] xy = splitPoint(StringPoint);
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            points.add(new Point(x, y));
        }
        return points;
    }

    private static String[] splitPoints(String value) {
        return value.split(POINTS_DELIMITER);
    }

    private static String[] splitPoint(String StringPoint) {
        return StringPoint.substring(1, StringPoint.length() - 1).split(POINT_DELIMITER);
    }

}
