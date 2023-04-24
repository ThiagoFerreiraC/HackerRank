import java.util.*;

public class Java_String_Reverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String result = "Yes";

        for(int i=0; i < A.length()/2 ; i++) {
            if ( A.charAt(i) != A.charAt(A.length()-1-i)) {
                result = "No";
                break;
            }
        }
        System.out.println(result);
    }
}



