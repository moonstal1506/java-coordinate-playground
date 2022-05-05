package coordinate.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;


class LineTest {

    private Line line;

    @BeforeEach
    void setUp() {
        List<Point> points = Arrays.asList(new Point(10,10), new Point(14,15));
        line = new Line(points);
    }

    @Test
    void 선_길이() {
        assertThat(line.area()).isEqualTo(6.403, offset(0.00099));
    }

}