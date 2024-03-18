import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.example.QuickestWayUp.quickestWayUp;

public class QuickestWayUpTest {

    @Test
    void defaultSuccess1(){
        List<List<Integer>> ladders = new ArrayList<>();
        List<List<Integer>> snakes = new ArrayList<>();

        ladders.add(Arrays.asList(32,62));
        ladders.add(Arrays.asList(42,68));
        ladders.add(Arrays.asList(12,98));

        snakes.add(Arrays.asList(95, 13));
        snakes.add(Arrays.asList(97, 25));
        snakes.add(Arrays.asList(93, 37));
        snakes.add(Arrays.asList(79, 27));
        snakes.add(Arrays.asList(75, 19));
        snakes.add(Arrays.asList(49, 47));
        snakes.add(Arrays.asList(67 ,17));

        Assertions.assertEquals(3,quickestWayUp(ladders,snakes));
    }

    @Test
    void defaultSuccess2(){
        List<List<Integer>> ladders = new ArrayList<>();
        List<List<Integer>> snakes = new ArrayList<>();

        ladders.add(Arrays.asList(8, 52 ));
        ladders.add(Arrays.asList(6, 80));
        ladders.add(Arrays.asList(26, 42));
        ladders.add(Arrays.asList(2, 72));

        snakes.add(Arrays.asList(51, 19));
        snakes.add(Arrays.asList(39, 11));
        snakes.add(Arrays.asList(37, 29));
        snakes.add(Arrays.asList(81, 3));
        snakes.add(Arrays.asList(59, 5));
        snakes.add(Arrays.asList(79, 23));
        snakes.add(Arrays.asList(53, 7));
        snakes.add(Arrays.asList(43, 33));
        snakes.add(Arrays.asList(77, 21));

        Assertions.assertEquals(5,quickestWayUp(ladders,snakes));
    }
}
