import java.util.*;

public class Java_End_of_file {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 1;
        while (scan.hasNextLine()) {
            System.out.println(count + " " + scan.nextLine());
            count++;
        }

        scan.close();
    }
}