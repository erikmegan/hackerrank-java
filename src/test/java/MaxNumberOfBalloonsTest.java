import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.MaxNumberOfBalloons.maxNumberOfBalloons;

public class MaxNumberOfBalloonsTest {

    @Test
    public void defaultSuccess(){
        String text = "loonballxballpoon";
//        System.out.println(maxNumberOfBalloons(text));

        Assertions.assertEquals(2,maxNumberOfBalloons(text));
    }
}
