import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.example.RoadsAndLibraries.roadsAndLibraries;

public class RoadsAndLibrariesTest {
    @Test
    void defaultSuccess1(){
        int n = 6;
        int c_lib = 2;
        int c_road = 3;
        List<List<Integer>> citiess = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(1, 3),
                Arrays.asList(4, 5),
                Arrays.asList(4, 6));
		long res1 = roadsAndLibraries(n,c_lib,c_road,citiess);

        Assertions.assertEquals(12,res1);

    }

    @Test
    void defaultSuccess2(){

        int n2 = 3;
        int c_lib2 = 2;
        int c_road2 = 1;
        List<List<Integer>> citiess2 = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3,1),
                Arrays.asList(2,3));
        long res2 = roadsAndLibraries(n2,c_lib2,c_road2,citiess2);

        Assertions.assertEquals(4,res2);
    }
}
