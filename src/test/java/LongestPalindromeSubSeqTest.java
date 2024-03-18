import org.junit.jupiter.api.Test;

import static org.example.LongestPalindromeSubSeq.longestPalinSubseq;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromeSubSeqTest {

    @Test
    public void testSucceed01(){
        String a = "bbabcbcababbaabba";
        int res = longestPalinSubseq(a);
        assertEquals(13,res);
    }
    @Test
    public void testSucceed02(){
        String a = "bbabcbcab";
        int res = longestPalinSubseq(a);
        assertEquals(7,res);
    }
}
