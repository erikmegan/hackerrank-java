package org.example;

import java.util.Arrays;
import java.util.List;

public class MatchingStrings {

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        // Write your code here

        Integer[] r = new Integer[queries.size()];
        for (int i = 0; i < queries.size(); i++){
            r[i] = 0;
            for (int x = 0 ; x <stringList.size(); x++){
                if (queries.get(i).equals(stringList.get(x))){
                    r[i] +=1;
                }
            }
        }
        return Arrays.asList(r);
    }
}
