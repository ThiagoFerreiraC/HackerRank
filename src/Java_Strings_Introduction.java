import java.util.*;

public class Java_Strings_Introduction {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.println(A.length() + B.length());
        System.out.println(A.compareToIgnoreCase(B) > 0 ? "Yes": "No");
        System.out.println(capitalizeFirstLetter(A) + " " + capitalizeFirstLetter(B));

    }

    public static String capitalizeFirstLetter(String word) {
        return word.substring(0,1).toUpperCase() + word.substring(1);
    }
}



