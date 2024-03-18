import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.ContainsDuplicate.containsDuplicate;

public class ContainsDuplicateTest {

    @Test
    public void defaultSuccess(){
        int[] num = {1,2,3,1};
//        System.out.println(containsDuplicate(num));

        Assertions.assertTrue(containsDuplicate(num));
    }
}
