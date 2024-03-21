package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class ClimbingLeaderBoard {

    // https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
        // Write your code here
        List<Integer> scores= new ArrayList<>(player.size());
        ranked= ranked.stream().distinct().sorted().collect(toList());
        for (Integer p : player) {
            int index = Collections.binarySearch(ranked, p);
            if(index<0){
                index+=ranked.size()+2;
            }
            else{
                index= ranked.size()+1 + (-1)*(index+1);
            }
            scores.add(index);
        }
        return scores;
    }
}
