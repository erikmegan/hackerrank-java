package org.example;

import java.util.HashMap;

public class MaxNumberOfBalloons {

    public static int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> balloonMap = new HashMap<>();
        HashMap<Character, Integer> countText = new HashMap<>();

        for (Character b : "balloon".toCharArray()){
            if (balloonMap.containsKey(b)){
                balloonMap.put(b,balloonMap.get(b) + 1);
            }else {
                balloonMap.put(b,1);
            }
        }

        for (Character t : text.toCharArray()){
            if (countText.containsKey(t)){
                countText.put(t,countText.get(t)+1);
            }else{
                countText.put(t,1);
            }
        }

        int res = text.length();
        for(Character c : balloonMap.keySet()){
            res = Math.min(res,countText.getOrDefault(c,0) / balloonMap.get(c));
        }
        return res;

    }

}
