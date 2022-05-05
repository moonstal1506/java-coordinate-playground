package coordinate.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
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
}