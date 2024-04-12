import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.IsPalindrome.isPalindrome;
import static org.example.IsPalindrome.isPalindrome2;

public class IsPalindromeTest {

    @Test
    public void defaultFailed(){
        String s = "asda";

        Assertions.assertFalse(isPalindrome(s));
        Assertions.assertFalse(isPalindrome2(s));
    }

    @Test
    public void defaultSuccess(){
        String s = "adada";

        Assertions.assertTrue(isPalindrome(s));
        Assertions.assertTrue(isPalindrome2(s));
    }
}
