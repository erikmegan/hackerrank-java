package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {

    // https://www.hackerrank.com/challenges/java-arraylist/problem
    public static void solution() throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();      //n lines of list
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {   // type n lines of integers for filling the arraylist of integer within this loop.
            int d = scanner.nextInt();
            list.add(new ArrayList<Integer>());
            for (int j = 0; j < d; j++) {
                list.get(i).add(scanner.nextInt());
            }
        }

        int q = scanner.nextInt();
        int[][] inputs = new int[q][2];
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < 2; j++) {
                inputs[i][j] = scanner.nextInt();
            }
        }
//        System.out.println(list);
//        System.out.println(Arrays.deepToString(inputs));
        for (int[] query: inputs) {
            try {
                printList(list, query[0], query[1]);
            } catch(Exception e) {
                System.out.println("ERROR!");
            }

        }
    }

    public static void printList(ArrayList<? extends ArrayList<? extends Number>> list, int row, int col)
            throws Exception {
        row -= 1;
        col -= 1;

        System.out.println(list.get(row).get(col));

    }
}
