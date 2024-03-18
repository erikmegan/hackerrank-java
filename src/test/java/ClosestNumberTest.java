import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.example.ClosestNumber.closestNumber;

public class ClosestNumberTest {

    @Test
    void defaultSuccess1(){
        List<Integer> a = Arrays.asList(5,4,3,2);
        List<Integer> res = Arrays.asList(2,3,3,4,4,5);

        Assertions.assertEquals(res,closestNumber(a));
    }

    @Test
    void defaultSuccess2(){
        List<Integer> a = Arrays.asList(-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854 );
        List<Integer> res = Arrays.asList(-20, 30);

        Assertions.assertEquals(res,closestNumber(a));
    }
}
