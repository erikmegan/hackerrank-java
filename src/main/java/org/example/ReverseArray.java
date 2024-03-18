package org.example;

import java.util.ArrayList;
import java.util.List;

public class ReverseArray {
    public static List<Integer> reverseArray(List<Integer> a) {
        // Write your code here
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < a.size(); i++){
            res.add(a.get(a.size()-1-i));
        }
        return res;
    }
}
