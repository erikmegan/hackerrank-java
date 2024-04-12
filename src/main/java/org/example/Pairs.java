package org.example;

import java.util.*;

public class Pairs {

    // https://www.hackerrank.com/challenges/pairs/problem
    public static int pairs(int k, List<Integer> arr) {
        // Write your code here
        int res = 0;
        arr.sort(Collections.reverseOrder());
        for(int i = 0; i<arr.size();i++){
            for(int j = i+1 ; j< arr.size(); j++){
                if(arr.get(i) - arr.get(j) == k){
                    res ++;
                }
            }
        }
        return res;
    }
    public static int pairsBestPractice(int k, List<Integer> arr) {
        int res = 0;
        Set<Integer> set = new HashSet<>(arr);
        for(Integer i : set) if(set.contains(i+k)) res++;
        return res;
    }
}
