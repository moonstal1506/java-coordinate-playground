package coordinate.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;
import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void 좌표생성(){
        Point point = new Point(1,2);
        assertThat(point).isEqualTo(new Point(1,2));
    }

    @Test
    void 범위초과(){
        assertThrows(IllegalArgumentException.class, ()->{
            new Point(0,1);
        });

        assertThrows(IllegalArgumentException.class, ()->{
            new Point(25,24);
        });
    }

    @Test
    void 거리계산() {
        Point point = new Point(10,10);

        assertThat(point.calculateDistance(new Point(14,15)))
                .isEqualTo(6.403, offset(0.00099));
    }
}