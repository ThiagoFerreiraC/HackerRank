import java.util.*;

public class Java_List {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int listSize = scan.nextInt();
        List<Integer> numbersList = new ArrayList<>();

        for (int i = 0; i < listSize; i++) {
            numbersList.add(scan.nextInt());
        }

        int queryAmount = scan.nextInt();

        for (int i = 0; i < queryAmount; i++) {
            String queryType = scan.next();
            if (queryType.equals("Insert")) {
                numbersList.add(scan.nextInt(), scan.nextInt());
            } else if (queryType.equals("Delete")) {
                numbersList.remove(scan.nextInt());
            }
        }

        numbersList.forEach(item -> System.out.print(item + " "));
    }
}