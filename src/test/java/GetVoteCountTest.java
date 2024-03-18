import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.GetVoteCount.getVoteCount;

public class GetVoteCountTest {

    @Test
    void defaultSuccess(){
        String cityname = "Seattle";
        int estimatedCost = 110;
        Long res = getVoteCount(cityname,estimatedCost);

        Assertions.assertEquals(2116,res);

    }
}
