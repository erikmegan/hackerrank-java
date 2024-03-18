import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.example.GetConcatenation.getConcatenation;

public class GetConcatenationTest {

    @Test
    public void defaultSuccess(){
        int[] num = {1,2,1,1,2,1};

        int[] res = {1,2,1,1,2,1,1,2,1,1,2,1};
        Assertions.assertEquals(Arrays.toString(res),
                Arrays.toString(getConcatenation(num)));
    }
}
