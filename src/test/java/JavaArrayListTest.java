import org.example.JavaArraylist;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class JavaArrayListTest {
    @Test
    public void testSolution() {
        // Prepare input data
        String input = "5\n5 41 77 74 22 44\n1 12\n4 37 34 36 52\n0\n3 20 22 33\n5\n1 3\n3 4\n3 1\n4 3\n5 5\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Redirect System.out to capture output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Call solution method
        try {
            JavaArraylist.solution();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Restore System.in and System.out
        System.setIn(System.in);
        System.setOut(originalOut);

        // Get captured output
        String actualOutput = outputStream.toString().trim();

        // Assert the output
        Assertions.assertEquals("74\n52\n37\nERROR!\nERROR!", actualOutput);
    }
}
