package HackerRank;

import java.util.*;

public class Java_Static_Initializer_Block {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int B = scan.nextInt();
        int H = scan.nextInt();

        if (B <=0 || H<=0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        } else {
            System.out.println(B*H);
        }
    }
}