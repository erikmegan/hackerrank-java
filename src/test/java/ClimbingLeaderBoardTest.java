import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.example.ClimbingLeaderBoard.climbingLeaderboard;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClimbingLeaderBoardTest {

    @Test
    public void defaultSuccess1(){
        Integer[] ranked = {100, 100, 50, 40, 40, 20, 10};
        Integer[] player = {5, 25, 50, 120};

        List<Integer> rankedList = Arrays.asList(ranked);
        List<Integer> playerList = Arrays.asList(player);
        List<Integer> climb = climbingLeaderboard(rankedList, playerList);

        List<Integer> result = Arrays.asList(6,4,2,1);
        assertEquals(result,climb);
    }

    @Test
    public void defaultSuccess2(){
        Integer[] ranked = {100, 90, 90, 80, 75, 60};
        Integer[] player = {50, 65, 77, 90, 102};

        List<Integer> rankedList = Arrays.asList(ranked);
        List<Integer> playerList = Arrays.asList(player);
        List<Integer> climb = climbingLeaderboard(rankedList, playerList);

        List<Integer> result = Arrays.asList(6, 5, 4, 2, 1);
        assertEquals(result,climb);
    }
}
