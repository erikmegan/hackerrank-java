package org.example;

import java.util.*;

public class QuickestWayUp {

    // https://www.hackerrank.com/challenges/the-quickest-way-up/problem
    public static int quickestWayUp(List<List<Integer>> ladders, List<List<Integer>> snakes) {
        // Write your code here
        Map<Integer,Integer> laddersMap=new HashMap<>();
        Map<Integer,Integer> snakesMap=new HashMap<>();

        // ladders map
        for (List<Integer> ladder : ladders) {
            laddersMap.put(ladder.get(0), ladder.get(1));
        }

        // snakes map
        for(int i=0;i<snakes.size();i++){
            snakesMap.put(snakes.get(i).get(0),snakes.get(i).get(1));
        }


        // building adjacency list
        List<Integer>[] adj=new LinkedList[101];
        for(int i=1;i<100;i++){
            for(int j=1;j<=6;j++){
                if(i+j<=100){
                    int toBox=i+j;
                    if(laddersMap.containsKey(i+j)){
                        toBox=laddersMap.get(i+j);
                    }
                    else if(snakesMap.containsKey(i+j)){
                        toBox=snakesMap.get(i+j);
                    }
                    if(adj[i]==null){
                        adj[i]=new LinkedList<Integer>();
                    }
                    adj[i].add(toBox);
                }
            }
        }
        adj[100] = new LinkedList<Integer>();
        // using BFS find the shortest path
        return findShortestPath(adj);
    }
    private static int findShortestPath(List<Integer>[] adj){
        int[] dis=new int[101];
        for(int i=0;i<=100;i++){
            dis[i]=Integer.MAX_VALUE;
        }

        Queue<Integer> queue=new LinkedList<>();
        queue.add(1);
        dis[1]=0;

        while(!queue.isEmpty()){
            int v=queue.poll();
            for(int u:adj[v]){
                if(dis[v]+1<dis[u]){
                    dis[u]=dis[v]+1;
                    queue.add(u);
                }
            }
        }
        return dis[100]==Integer.MAX_VALUE?-1:dis[100];
    }
}
