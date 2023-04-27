package HackerRank;

import java.io.*;
import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Java_2D_Array {
    public static void main(String[] args) throws IOException {
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

        int hourglassSizeLimit = arr.size() - 2;
        int largestSum = 0;

        for (int i = 0; i < hourglassSizeLimit; i++) {
            for (int j = 0; j < hourglassSizeLimit; j++) {
                int sum = arr.get(i).get(j)
                        + arr.get(i).get(j + 1)
                        + arr.get(i).get(j + 2)
                        + arr.get(i + 1).get(j + 1)
                        + arr.get(i + 2).get(j)
                        + arr.get(i + 2).get(j + 1)
                        + arr.get(i + 2).get(j + 2);

                if (i == 0 && j == 0) {
                    largestSum = sum;
                } else if (largestSum < sum) {
                    largestSum = sum;
                }
            }

        }
        System.out.println(largestSum);
        bufferedReader.close();
    }
}
