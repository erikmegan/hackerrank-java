import org.junit.jupiter.api.Test;

import static org.example.DisplayPrime.displayPrimes;

public class DisplayPrimeTest {

    @Test
    void defaultSuccess(){
        int n = 100; // Ubah nilai ini sesuai dengan kebutuhan Anda

		System.out.println("Prime numbers up to " + n + ":");
		displayPrimes(n);
    }

}
