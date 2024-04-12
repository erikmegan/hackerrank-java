package org.example;

public class DisplayPrime {
    public static void displayPrimes(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static Boolean definePrime(int n){
        for(int i=2;i<n;i++) {
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
