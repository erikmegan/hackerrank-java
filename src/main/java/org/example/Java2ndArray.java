package org.example;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Java2ndArray {

    // https://www.hackerrank.com/challenges/java-2d-array/problem

    public static void j2ndArr(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        bufferedReader.close();


        int res = Integer.MIN_VALUE,temp = Integer.MIN_VALUE;
        for (int i = 0 ; i <= 3; i++){
            for( int j = 0 ; j <= 3; j++){
                temp = arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2);
                temp += arr.get(i+1).get(j+1);
                temp += arr.get(i+2).get(j) + arr.get(i+2).get(j+1) +arr.get(i+2).get(j+2);
                if (res < temp){
                    res = temp;
                }
            }
        }
        System.out.println(res);
    }
}
