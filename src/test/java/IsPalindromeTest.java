import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.IsPalindrome.isPalindrome;

public class IsPalindromeTest {

    @Test
    public void defaultFailed(){
        String s = "asda";

        Assertions.assertFalse(isPalindrome(s));
    }

    @Test
    public void defaultSuccess(){
        String s = "adada";

        Assertions.assertTrue(isPalindrome(s));
    }
}
