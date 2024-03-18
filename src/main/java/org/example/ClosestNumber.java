package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClosestNumber {

    // https://www.hackerrank.com/challenges/closest-numbers/problem
    public static List<Integer> closestNumber(List<Integer> numbers) {
        List<Integer> res = new ArrayList<>();
        Collections.sort(numbers);
        //search the minimum
        int minimum = Integer.MAX_VALUE;
        for(int i = 1; i < numbers.size(); i++) {
            int min = numbers.get(i) - numbers.get(i-1);
            if(min < minimum) {
                minimum = min;
            }
        }

        for(int i = 1; i < numbers.size(); i++) {
            int min = numbers.get(i) - numbers.get(i-1);
            if(min == minimum) {
                System.out.print(numbers.get(i-1) + " " + numbers.get(i));
                res.add(numbers.get(i-1));
                res.add(numbers.get(i));
            }
        }
        return res;
    }
}
