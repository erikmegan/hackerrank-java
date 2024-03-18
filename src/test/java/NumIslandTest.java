import org.junit.jupiter.api.Test;

import static org.example.NumIslands.numIslands;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumIslandTest {

    @Test
    public void testSuccess1(){
        char[][] grid = {
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        int res = numIslands(grid);
        assertEquals(1,res);
    }

    @Test
    public void testSuccess2(){
        char grid2[][] = {
                {'1','1','0','0','0'},
                {'1','1','0','0','0'},
                {'0','0','1','0','0'},
                {'0','0','0','1','1'}
        };
        int res2 = numIslands(grid2);
        assertEquals(3,res2);
    }
}
