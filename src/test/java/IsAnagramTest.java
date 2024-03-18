import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.IsAnagram.isAnagram;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsAnagramTest {

    @Test
    public void defaultSuccess(){
        String s = "daa";
        String t = "ada";

        Assertions.assertTrue(isAnagram(s,t));
    }

    @Test
    public void defaultFailed(){
        String s = "daa";
        String t = "adaa";

        Assertions.assertFalse(isAnagram(s,t));
    }
}
