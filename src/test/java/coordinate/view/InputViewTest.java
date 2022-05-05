package coordinate.view;

import coordinate.model.Line;
import coordinate.model.Point;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;
import static org.junit.jupiter.api.Assertions.*;

class InputViewTest {

    private Line line;

    @BeforeEach
    void setUp() {
        List<Point> points = Arrays.asList(new Point(10,10), new Point(14,15));
        line = new Line(points);
    }

    @Test
    void 선_생성() {
        assertThat(InputView.input("(10,10)-(14,15)"))
                .isEqualTo(line);
    }

}