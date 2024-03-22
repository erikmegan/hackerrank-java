package org.example;

import java.util.Scanner;

public class Java1dArray {

    // https://www.hackerrank.com/challenges/java-1d-array/problem
    public static void solution() {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }

    public static boolean canWin(int leap, int[] game) {
        return canWinHelper(0, leap, game);
    }

    private static boolean canWinHelper(int position, int leap, int[] game) {
        if (position < 0 || game[position] == 1) {
            return false;
        }
        if (position == game.length - 1 || position + leap >= game.length) {
            return true;
        }
        game[position] = 1; // Mark as visited
        return canWinHelper(position + leap, leap, game) || canWinHelper(position + 1, leap, game) || canWinHelper(position - 1, leap, game);
    }
}
