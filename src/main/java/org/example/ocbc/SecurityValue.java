package org.example.ocbc;

import java.util.*;
import java.util.stream.Collectors;

public class SecurityValue {
    private static int getMinSum(List<Integer> securityValues, String msg) {

        Map<String, Integer> alphabetMap = getAlphabetMap();
        List<Integer> decryptedMessage = new ArrayList<>();

        for (int i = 0; i < msg.toCharArray().length; i++) {
            int alphabetPosition = alphabetMap.get(Character.toString(msg.charAt(i)));
            decryptedMessage.add(securityValues.get(alphabetPosition));
        }
        decryptedMessage = decryptedMessage.stream().sorted().collect(Collectors.toList());
        int total = 0;
        for (int i = 1; i < decryptedMessage.size(); i++) {
            int previousIndex = i - 1;
            total += decryptedMessage.get(i) - decryptedMessage.get(previousIndex);
        }
        return total;
    }
    private static Map<String, Integer> getAlphabetMap() {
        Map<String, Integer> alphabetMap = new HashMap<>();
        alphabetMap.put("a", 0);
        alphabetMap.put("b", 1);
        alphabetMap.put("c", 2);
        alphabetMap.put("d", 3);
        alphabetMap.put("e", 4);
        alphabetMap.put("f", 5);
        alphabetMap.put("g", 6);
        alphabetMap.put("h", 7);
        alphabetMap.put("i", 8);
        alphabetMap.put("j", 9);
        alphabetMap.put("k", 10);
        alphabetMap.put("l", 11);
        alphabetMap.put("m", 12);
        alphabetMap.put("n", 13);
        alphabetMap.put("o", 14);
        alphabetMap.put("p", 15);
        alphabetMap.put("q", 16);
        alphabetMap.put("r", 17);
        alphabetMap.put("s", 18);
        alphabetMap.put("t", 19);
        alphabetMap.put("u", 20);
        alphabetMap.put("v", 21);
        alphabetMap.put("w", 22);
        alphabetMap.put("x", 23);
        alphabetMap.put("y", 24);
        alphabetMap.put("z", 25);
        return alphabetMap;
    }
}
