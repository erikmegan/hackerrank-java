package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IoBuffered {
    public static void main(String[] args) throws IOException{
        buffered();
    }
    public static void buffered() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("This is buffered reader");
        System.out.print("Enter your name: ");
        String name = reader.readLine();

        int number =0;
        try {
            System.out.print("umur: ");
            String umur = reader.readLine();

            // Mengonversi input string menjadi integer
            number = Integer.parseInt(umur);

            System.out.println("You entered: " + number);

        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid integer.");
            // Anda dapat menambahkan tindakan tambahan di sini, seperti memberikan petunjuk kepada pengguna tentang format yang benar.

        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
            e.printStackTrace();

        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("An error occurred while closing the reader.");
                e.printStackTrace();
            }
        }

        System.out.println("Hello " + name);
        System.out.println("umur: " + number);
        reader.close();
    }
}
