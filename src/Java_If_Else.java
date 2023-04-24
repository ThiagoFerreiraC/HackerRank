import java.util.*;

public class Java_If_Else {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        boolean odd = N%2 != 0;

        if(odd) {
            System.out.println("Weird");
        } else if (N>20 || N<=5) {
            System.out.println("Not Weird");
        } else{
            System.out.println("Weird");
        }
        scanner.close();
    }
}
