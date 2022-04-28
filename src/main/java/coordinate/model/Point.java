package coordinate.model;

import java.util.Objects;

public class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        Validate(x, y);
        this.x = x;
        this.y = y;
    }

    private void Validate(int x, int y) {
        if(!(1<= x && x <=24)||!(1<= y && y <=24)){
            throw new IllegalArgumentException("최대 24까지만 입력할 수 있습니다.");
        }
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
