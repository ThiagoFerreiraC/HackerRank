import java.util.*;


public class Java_String_Tokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] wordArray = s.split("[^a-zA-Z]");
        Object[] array = Arrays.stream(wordArray)
                .filter(token -> !token.equals(""))
                .toArray();

        System.out.println(array.length);
        Arrays.stream(array).forEach(System.out::println);
        scan.close();
    }
}
