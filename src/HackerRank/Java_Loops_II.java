package HackerRank;

import java.util.*;

class Java_Loops_II {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int expoente =0;

            for(int j=0; j<n; j++) {
                expoente += (int) Math.pow(2, j)*b;
                int termo = a + expoente;
                System.out.print(termo + " " );
            }
            System.out.println();
        }
        in.close();
    }
}
