package HackerRank;

import java.util.*;
import java.text.*;

public class Java_Currency_Formatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale india = new Locale.Builder().setRegion("IN").setLanguage("en").build();


        System.out.println("US: " + NumberFormat.getCurrencyInstance(Locale.US).format(payment));
        System.out.println("India: " +  NumberFormat.getCurrencyInstance(india).format(payment));
        System.out.println("China: " +  NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment));
        System.out.println("France: " +  NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment));
    }
}