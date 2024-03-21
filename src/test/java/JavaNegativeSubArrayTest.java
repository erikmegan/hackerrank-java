import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;

import static org.example.JavaNegativeSubArray.javNegSubArr;

public class JavaNegativeSubArrayTest {
    @Test
    public void defaultSuccess() throws IOException {
        // Mocking input
        ByteArrayInputStream inputStream = new ByteArrayInputStream("5\n1 -2 4 -5 1\n".getBytes());
        System.setIn(inputStream);

        int result = javNegSubArr();

        // Mengembalikan input stream ke System.in
        System.setIn(System.in);

        // Hasil yang diharapkan adalah 10 + 20 = 30
        Assertions.assertEquals(9, result);
    }

    @Test
    public void defaultSuccess2() throws IOException {
        // Mocking input
        ByteArrayInputStream inputStream = new ByteArrayInputStream("100\n463 589 -321 164 -613 246 -869 -889 -712 -251 969 -603 49 185 439 479 255 -660 848 157 644 498 -722 82 -275 -645 -268 -255 573 910 303 267 -162 487 103 -823 400 612 -61 -260 732 286 505 -22 37 443 27 603 341 -904 -87 -895 -753 314 257 856 832 -695 -387 416 354 117 273 -275 811 -114 -962 -90 868 883 -330 467 233 852 232 -44 831 -672 -883 -774 -830 297 -897 -860 143 594 186 -988 928 391 -812 99 302 -803 -422 583 817 748 -619 183\n".getBytes());
        System.setIn(inputStream);

        int result = javNegSubArr();

        // Mengembalikan input stream ke System.in
        System.setIn(System.in);

        // Hasil yang diharapkan adalah 10 + 20 = 30
        Assertions.assertEquals(953, result);
    }
}
