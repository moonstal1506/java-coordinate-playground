package coordinate.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    private List<Point> points;

    @BeforeEach
    void setUp() {
        points = new ArrayList<>();
    }

    @Test
    void 직사각형_예외() {
        points.add(new Point(11,10));
        points.add(new Point(22,10));
        points.add(new Point(21,13));
        points.add(new Point(10,18));
        assertThrows(IllegalArgumentException.class, ()->{
            new Rectangle(points);
        });
    }

    @Test
    void 직사각형_넓이계산() {
        points.add(new Point(10,10));
        points.add(new Point(22,10));
        points.add(new Point(22,18));
        points.add(new Point(10,18));
        Rectangle rectangle = new Rectangle(points);
        assertThat(rectangle.area())
                .isEqualTo(96);
    }
}