package HackerRank;

import java.util.Scanner;

public class Java_Substring_Comparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0,k);

        for(int i=1; i<= s.length()-k; i++) {
            String shorterString = s.substring(i, i+k);
            smallest = (shorterString.compareTo(smallest) < 0) ? shorterString: smallest;
            largest = (shorterString.compareTo(largest) > 0) ? shorterString: largest;
        }
        return smallest + "\n" + largest;
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}