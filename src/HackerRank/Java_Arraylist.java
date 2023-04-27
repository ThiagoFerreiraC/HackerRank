package HackerRank;

import java.util.*;

public class Java_Arraylist {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int lineAmount = scan.nextInt();
       List<List<Integer>> integersList = new ArrayList<>();

        for (int i = 0; i < lineAmount; i++) {
            int numberAmountPerLine = scan.nextInt();
            List<Integer> sublist = new ArrayList<>();
            for (int j = 0; j < numberAmountPerLine; j++) {
                sublist.add(scan.nextInt());
            }
            integersList.add(sublist);
        }

        int queryAmount = scan.nextInt();
        for (int i = 0; i < queryAmount; i++) {
            try {
                int first = scan.nextInt();
                int second = scan.nextInt();
                System.out.println(
                        integersList.get(first-1).get(second-1));
            } catch (Exception ex) {
                System.out.println("ERROR!");
            }
        }
    }
}