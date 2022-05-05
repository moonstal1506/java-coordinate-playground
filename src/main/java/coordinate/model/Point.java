package coordinate.model;

import java.util.Objects;

public class Point {

    public static final int MIN = 1;
    public static final int MAX = 24;
    private static final String ERROR_OUT_OF_RANGE = "1에서 24까지만 입력가능합니다.";
    private int x;
    private int y;

    public Point(int x, int y) {
        checkRange(x, y);
        this.x = x;
        this.y = y;
    }

    private void checkRange(int x, int y) {
        if (checkNumber(x) || (checkNumber(y))) {
            throw new IllegalArgumentException(ERROR_OUT_OF_RANGE);
        }
    }

    private boolean checkNumber(int number) {
        return number < MIN || number > MAX;
    }

    public double calculateDistance(Point point) {
        return Math.sqrt(subtractAndPow(point.getX(), this.x) + subtractAndPow(point.getY(), this.y));
    }

    private double subtractAndPow(int firstNumber, int secondNumber) {
        return Math.pow(firstNumber - secondNumber, 2);
    }


    public int getX() {
        return x;
    }

    public int getY() {
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
