import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.example.Pairs.pairs;
import static org.example.Pairs.pairsBestPractice;

public class PairTest {

    @Test
    void defaultSuccess1(){
        List<Integer> arr = Arrays.asList(4,3,2,1);
        int k = 1;
        int res = 3;
        Assertions.assertEquals(res, pairs(k,arr));
        Assertions.assertEquals(res,pairsBestPractice(k,arr));
    }

    @Test
    void defaultSuccess2(){
        List<Integer> arr = Arrays.asList(1, 3, 5, 8, 6, 4, 2);
        int k = 2;
        int res = 5;
        Assertions.assertEquals(res, pairs(k,arr));
        Assertions.assertEquals(res,pairsBestPractice(k,arr));
    }
    @Test
    void defaultSuccess3(){
        List<Integer> arr = Arrays.asList(363374326, 364147530, 61825163, 1073065718, 1281246024, 1399469912, 428047635, 491595254, 879792181, 1069262793);
        int k = 1;
        int res = 0;
        Assertions.assertEquals(res, pairs(k,arr));
        Assertions.assertEquals(res,pairsBestPractice(k,arr));
    }
}
