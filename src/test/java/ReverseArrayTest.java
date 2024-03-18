import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.example.ReverseArray.reverseArray;

public class ReverseArrayTest {

    @Test
    void defaultSuccess(){
        List<Integer> a = Arrays.asList(2 ,3 ,4, 1);

        Assertions.assertEquals(Arrays.asList(1,4,3,2), reverseArray(a));
    }
    @Test
    void defaultFailed(){
        List<Integer> a = Arrays.asList(2 ,3 ,4, 1);

        Assertions.assertNotEquals(Arrays.asList(1,2,3,4), reverseArray(a));
    }
}
