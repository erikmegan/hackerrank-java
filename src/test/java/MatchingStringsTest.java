import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.example.MatchingStrings.matchingStrings;

public class MatchingStringsTest {
    @Test
    void defaultSuccess(){
        List<String> stringList = Arrays.asList("aba", "baba", "aba", "xzxb");
        List<String> queries = Arrays.asList("aba", "xzxb", "ab");

        List<Integer> res = Arrays.asList(2,1,0);

        Assertions.assertEquals(res,matchingStrings(stringList,queries));
    }
}
