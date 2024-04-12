import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.example.DisplayPrime.definePrime;
import static org.example.DisplayPrime.displayPrimes;

public class DisplayPrimeTest {

    @Test
    void defaultSuccess(){
        int n = 100;

		System.out.println("Prime numbers up to " + n + ":");
		displayPrimes(n);
    }

    @Test
    void definePrimeTest(){
        int n = 13;
        Assertions.assertEquals(true,definePrime(n));
    }

}
