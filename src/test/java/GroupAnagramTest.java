import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.example.GroupAnagram.groupAnagrams;

public class GroupAnagramTest {

    @Test
    public void defaultSuccess(){
        String[] str = {"bat","nat","tan","ate","eat","tea"};
        List<List<String>> result = Arrays.asList(
                Arrays.asList("ate", "eat", "tea"),
                List.of("bat"),
                Arrays.asList("nat", "tan"));
//        System.out.println(groupAnagrams(str));

        Assertions.assertEquals(result,groupAnagrams(str));

    }
}
