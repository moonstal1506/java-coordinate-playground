package coordinate.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void 좌표생성() {
        Point point = new Point(24, 24);
        assertThat(point).isEqualTo(new Point(24, 24));
    }

    @Test
    void 숫자예외() {
        assertThatThrownBy(() -> {
            new Point(25,25);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("최대 24까지만 입력할 수 있습니다.");
    }
}