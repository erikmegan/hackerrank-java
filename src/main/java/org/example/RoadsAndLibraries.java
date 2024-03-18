package org.example;

import java.util.*;

public class RoadsAndLibraries {
    public static long roadsAndLibraries(int n, int c_lib, int c_road, List<List<Integer>> citiess) {
        // Write your code here

        int[][] cities = new int[citiess.size()][];
        for (int i = 0; i < citiess.size(); i++) {
            List<Integer> innerList = citiess.get(i);
            cities[i] = new int[innerList.size()];
            for (int j = 0; j < innerList.size(); j++) {
                cities[i][j] = innerList.get(j);
            }
        }

        if(cities == null || cities.length == 0) {
            return (long)n*c_lib;
        }

        if (c_lib <= c_road) {
            return (long)c_lib*n;
        }

        Map<Integer, Set<Integer>> citiesMap = new HashMap<>();

        for(int i=1; i<n+1; i++) {
            citiesMap.put(i, new HashSet<Integer>());
        }

        boolean[] visited = new boolean[n+1];

        for(int i=0; i<cities.length; i++) {
            int from = cities[i][0];
            int to = cities[i][1];

            citiesMap.get(from).add(to);
            citiesMap.get(to).add(from);
        }

        long answer = 0;

        for(int city=1; city<n+1; city++) {
            if(!visited[city]) {
                visited[city] = true;
                int cityNumberOfTown = 1;
                Queue<Integer> q = new LinkedList<>();
                q.add(city);

                while(!q.isEmpty()) {
                    Integer cityFrom = q.poll();

                    Iterator<Integer> it = citiesMap.get(cityFrom).iterator();

                    while(it.hasNext()) {
                        int connectedCity = it.next();

                        if(!visited[connectedCity]) {
                            q.add(connectedCity);
                            cityNumberOfTown++;
                            visited[connectedCity] = true;
                        }
                    }
                }

                answer += (long)(cityNumberOfTown-1)*(long)c_road + (long)c_lib;
            }
        }

        return answer;
    }
}
