package org.example;

import java.util.function.BiFunction;

public class NumIslands {
    public static int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    printGrid(grid);
                    dfs(grid, i, j);
                    count++;
                }
            }
        }
        return count;
    }
    public static void dfs(char[][] grid, int i, int j) {
        if (
                i < 0 ||
                        j < 0 ||
                        i >= grid.length ||
                        j >= grid[0].length ||
                        grid[i][j] == '0'
        ) {
            return;
        }
        grid[i][j] = '0';
        dfs(grid, i + 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i - 1, j);
        dfs(grid, i, j - 1);
    }

    public static void printGrid(char[][] grid){
        for ( int i = 0 ; i < grid.length; i++){
            for ( int y = 0 ; y < grid[0].length ; y++){
                System.out.print(grid[i][y]);
            }
            System.out.println();
        }
        System.out.println();
    }

    class  RecursiveBiFunction<A, B, C> {
        BiFunction<A, B, C> func;
    }

}
