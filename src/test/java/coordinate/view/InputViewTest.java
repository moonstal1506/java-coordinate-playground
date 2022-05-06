package coordinate.view;

import coordinate.model.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;
import static org.junit.jupiter.api.Assertions.*;

class InputViewTest {

    private List<Point> points;

    @BeforeEach
    void setUp() {
        points = new ArrayList<>();
    }

    @Test
    void 선_생성() {
        points.add(new Point(10,10));
        points.add(new Point(14,15));
        Line line = new Line(points);
        assertThat(InputView.input("(10,10)-(14,15)"))
                .isEqualTo(line);
    }

    @Test
    void 사각형_생성() {
        points.add(new Point(10,10));
        points.add(new Point(22,10));
        points.add(new Point(22,18));
        points.add(new Point(10,18));
        Rectangle rectangle = new Rectangle(points);
        assertThat(InputView.input("(10,10)-(22,10)-(22,18)-(10,18)"))
                .isEqualTo(rectangle);
    }
}