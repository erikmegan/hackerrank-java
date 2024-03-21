package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaNegativeSubArray {

    // https://www.hackerrank.com/challenges/java-negative-subarray/problem

    public static int javNegSubArr() throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(bufferedReader.readLine());
        String line = bufferedReader.readLine();
        String[] temp = line.split(" ");

        int [] nums = new int[length];
        for (int i = 0; i < length; i++) {
            nums[i] = Integer.parseInt(temp[i]);
        }

        int count = 0;
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int sum = add(nums , i,j);
                if (sum < 0 ) count ++;
            }
        }
        System.out.println(count);
        return count;
    }

    private static int add (int[] nums, int i, int j) {
        int sum = 0;
        while (i<=j){
            sum += nums[i++];
        }
        return sum;
    }
}
