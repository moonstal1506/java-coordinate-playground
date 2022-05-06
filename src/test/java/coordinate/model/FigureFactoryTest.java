package coordinate.model;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class FigureFactoryTest {

    private List<Point> points;

    @BeforeEach
    void setUp() {
        points = new ArrayList<>();
    }

    @Test
    void 선_생성() {
        points.add(new Point(10,10));
        points.add(new Point(14,15));
        assertThat(FigureFactory.create(points)).isEqualTo(new Line(points));
    }

    @Test
    void 직사각형_생성() {
        points.add(new Point(10,10));
        points.add(new Point(22,10));
        points.add(new Point(22,18));
        points.add(new Point(10,18));
        assertThat(FigureFactory.create(points)).isEqualTo(new Rectangle(points));
    }
}