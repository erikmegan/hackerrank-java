package org.example;

import java.util.ArrayList;
import java.util.List;

public class RotateLeft {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        List<Integer> rotatedArr = new ArrayList<>(arr);

        for (int i = 0; i < d % rotatedArr.size(); i++) {
            int n = rotatedArr.getFirst();
            rotatedArr.removeFirst();
            rotatedArr.add(n);
        }

        return rotatedArr;
    }
}
