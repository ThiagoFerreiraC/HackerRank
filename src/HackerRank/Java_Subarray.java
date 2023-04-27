package HackerRank;

import java.util.*;

public class Java_Subarray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int length = scan.nextInt();
        int[] numberArray = new int[length];

        for (int i = 0; i < length; i++) {
            int number = scan.nextInt();
            numberArray[i] = number;
        }

        int count = 0;

        for (int i = 0; i < length; i++) {
            int sum = 0;
            for (int j = i; j < length; j++) {
                sum += numberArray[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}