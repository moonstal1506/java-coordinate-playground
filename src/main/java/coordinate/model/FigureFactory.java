package coordinate.model;

import java.util.List;

public class FigureFactory {

    public static Figure create(List<Point> points){
        if(points.size()==Line.POINTS_SIZE_OF_LINE){
            return new Line(points);
        }
        throw new IllegalArgumentException();
    }

}
