import org.example.Java1dArray;
import org.example.JavaArraylist;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Java1dArrayTest {

    @Test
    public void testSolution() {
        // Prepare input data
        String input = "3\n11 5\n0 1 1 1 0 0 0 0 0 0 1\n11 5\n0 1 1 1 0 0 1 1 1 0 1\n11 5\n0 1 1 1 1 0 1 1 1 0 1\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Redirect System.out to capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Call solution method
        try {
            Java1dArray.solution();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Restore System.in and System.out
        System.setIn(System.in);
        System.setOut(originalOut);

        // Get captured output
        String actualOutput = outputStream.toString().trim();

        // Assert the output
        Assertions.assertEquals("YES\n" +
                "YES\n" +
                "NO", actualOutput);
    }
}
