//Complete this code or write your own from scratch

import java.util.*;

class Java_Map {
    public static void main(String[] argh) {
        Scanner scan = new Scanner(System.in);
        int entriesAmount = scan.nextInt();
        scan.nextLine();
        Map<String, Integer> namePhoneMap = new HashMap<>();

        for (int i = 0; i < entriesAmount; i++) {
            String name = scan.nextLine();
            int phone = scan.nextInt();
            scan.nextLine();
            namePhoneMap.put(name, phone);
        }

        while (scan.hasNext()) {
            String searchName = scan.nextLine();
            Integer searchPhone = namePhoneMap.get(searchName);

            System.out.println(
                    searchPhone == null ? "Not found" : searchName + "=" + searchPhone);
        }
    }
}



