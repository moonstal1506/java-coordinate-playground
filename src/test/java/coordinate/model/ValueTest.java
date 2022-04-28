package coordinate.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ValueTest {

    @Test
    void x와y구분() {
        Value value =new Value("(1,2)");
        Point point = value.createPoint();
        assertThat(point).isEqualTo(new Point(1, 2));
    }
}