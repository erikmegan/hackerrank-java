package org.example.ocbc;

import java.util.*;
import java.util.stream.Collectors;

public class CloudDataTransfer {

    private int getMaxSum(int n, int k, List<List<Integer>> plans) {
        plans.sort(Comparator.comparing(list -> list.get(3)));

        int totalCost = 0;
        for(int day = 1; day <= n; day++) {
            int costPerday = 0;
            int corePerDay = k;
            for (List<Integer> integers : plans) {
                int startDay = integers.get(0);
                int endDay = integers.get(1);
                int core = integers.get(2);
                int cost = integers.get(3);

                if (isCoreNeededAlreadyMet(corePerDay)) {
                    break;
                }

                if (isPlanAvailableForToday(day, startDay, endDay)) {
                    if (isCoreNeededGreaterThanAvailableCore(corePerDay, core)) {
                        corePerDay -= core;
                        costPerday += (cost * core);
                    } else {
                        costPerday += (cost * corePerDay);
                        corePerDay -= core;
                    }
                }
            }
            totalCost += costPerday;
        }
        return totalCost;
    }


    private boolean isCoreNeededAlreadyMet(int corePerDay) {
        return corePerDay <= 0;
    }

    private boolean isPlanAvailableForToday(int day, int startDay, int endDay) {
        return day >= startDay && day <= endDay;
    }

    private boolean isCoreNeededGreaterThanAvailableCore(int corePerDay, int coreAvailable) {
        return corePerDay > coreAvailable;
    }

}
