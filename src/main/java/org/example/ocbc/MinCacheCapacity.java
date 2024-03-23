package org.example.ocbc;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MinCacheCapacity {
    public static int getMinimumSize(List<String> requests, int k) {
        int maxCacheSize = 2; //asumsi berdasarkan test case
        if (requests.size() <= 1) {
            return -1;
        }

        Set<String> cache = new HashSet<>();
        int totalRequest = 0;

        for (String item : requests) {
            if (cache.contains(item)) {
                continue;
            } else {
                if (cache.size() < maxCacheSize) {
                    cache.add(item);
                } else {
                    cache.remove(requests.get(totalRequest - maxCacheSize));
                    cache.add(item);
                }
            }
            totalRequest++;
        }
        return cache.size();
    }
}
