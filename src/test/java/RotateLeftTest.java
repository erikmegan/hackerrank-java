import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.example.RotateLeft.rotateLeft;

public class RotateLeftTest {

    @Test
    void defaultSuccess(){
        List<Integer> arr = Arrays.asList(1, 2, 3, 4, 5);
        int d = 4;

        Assertions.assertEquals(Arrays.asList(5,1,2,3,4),rotateLeft(d,arr));
    }
}
