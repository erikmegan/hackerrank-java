package org.example;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class IoScanner {
    public static void main(String[] args) {
//        scanner();
        simpleInputInt();
    }

    public static void scanner(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("This is scanner");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("umur :");

        int umur = 0;
        try {
            umur = scanner.nextInt();
        }catch (InputMismatchException e){
            System.out.println("invalid input");
            scanner.close();
        }

        System.out.println("Hello " + name);
        System.out.println("umur: " + umur);
        scanner.close();
    }

    public static void simpleInputInt(){
        System.out.print("input integer: ");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("integer : " + n);
    }

}
