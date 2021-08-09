package DataStructures.Java2DArray;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;


public class Solution {

    public static int hourGlassSum(List<List<Integer>> arr) {
        int maxSum = Integer.MIN_VALUE;
        int n = arr.get(0).size();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < 4 && j < 4) {
                    sum = arr.get(i).get(j) +
                            arr.get(i).get(j + 1) +
                            arr.get(i).get(j + 2) +
                            arr.get(i + 1).get(j + 1) +
                            arr.get(i + 2).get(j) +
                            arr.get(i + 2).get(j + 1) +
                            arr.get(i + 2).get(j + 2);
                }
                maxSum = Math.max(sum, maxSum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        PrintStream p = new PrintStream(System.out);

        List<List<Integer>> arrList = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            arrList.add(Stream.of(in.nextLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList()));
        });


        p.println(hourGlassSum(arrList));

        p.close();
        in.close();
    }
}

// 2nd onD
// 31st problem