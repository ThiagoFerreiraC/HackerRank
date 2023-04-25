import java.math.BigInteger;
import java.util.*;

public class Java_BigInteger {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();

        BigInteger abi = new BigInteger(a);
        BigInteger bbi = new BigInteger(b);

        System.out.println(abi.add(bbi));
        System.out.println(abi.multiply(bbi));


    }
}