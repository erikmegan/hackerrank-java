import org.example.IslandPerimeter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IslandPerimeterTest {

    IslandPerimeter islandPerimeter = new IslandPerimeter();
    private  int grid[][] = {
            {0,1,0,0},
            {1,1,1,0},
            {0,1,0,0},
            {1,1,0,0}
    };

    @Test
    public void testSuccess1(){

        int res = islandPerimeter.islandPerimeter(grid);
        assertEquals(16,res);
    }

    @Test
    public void testWithoutBiFunctionSuccess(){
        int res = islandPerimeter.islandPerimeterWithoutBiFunction(grid);
        assertEquals(16,res);
    }
}
