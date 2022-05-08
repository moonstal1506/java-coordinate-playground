package coordinate.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;
import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {
    private List<Point> points;

    @BeforeEach
    void setUp() {
        points = new ArrayList<>();
    }

    @Test
    void 삼각형_넓이계산() {
        points.add(new Point(1,1));
        points.add(new Point(1,5));
        points.add(new Point(5,1));
        Triangle triangle = new Triangle(points);
        assertThat(triangle.area())
                .isEqualTo(8.0, offset(0.00099));
    }
}