package org.example;

public class SwapVariables {
    public static void arithmetic() {
        int a = 5;
        int b = 10;

        System.out.println("a before swapping : " + a );
        System.out.println("b before swapping : " + b );
        System.out.println("================================" );

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a after swapping: " + a);
        System.out.println("b after swapping: " + b);
    }

    public static void bitwiseXOR() {
        int a = 5;
        int b = 10;

        System.out.println("a before swapping : " + a );
        System.out.println("b before swapping : " + b );
        System.out.println("================================" );

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("a after swapping: " + a);
        System.out.println("b after swapping: " + b);
    }
}
