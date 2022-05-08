package coordinate.model;

import java.util.List;
import java.util.Objects;

public abstract class Figure {

    private List<Point> points;

    public Figure(List<Point> points) {
        this.points = points;
    }

    public abstract double area();

    public abstract String reportArea();

    public List<Point> getPoints() {
        return points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Figure figure = (Figure) o;
        return Objects.equals(points, figure.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }
}
