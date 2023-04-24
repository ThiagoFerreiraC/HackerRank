import java.util.Scanner;

public class Java_Anagrams {


    static boolean isAnagram(String a, String b) {
        boolean result = true;

         if (a.length() != b.length()) {
            result = false;
        } else {

            String[] firstArray = getSplitLetters(a);
            String[] secondArray = getSplitLetters(b);

            for (String letter : firstArray) {
                for (int i = 0; i < secondArray.length; i++) {
                    if (letter.equals(secondArray[i])) {
                        secondArray[i] = null;
                        break;
                    }
                }
            }
            //Not allowed to import Collections or streams to sort automatically

            for (String letter : secondArray) {
                if (letter != null) {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }

    public static String[] getSplitLetters(String word) {
        return word.toLowerCase().split("");
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
