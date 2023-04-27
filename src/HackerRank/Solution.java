package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        String diamonds ="^\\Q<\\E.\\Q>\\E$";
        while(testCases>0){
            String line = in.nextLine();

            String initialTag = "";
            int indexOfLeftDiamond = 0;
            int indexOfRightDiamond = 0;

            while(line.contains("<")) {
                indexOfLeftDiamond = line.indexOf('<');
                indexOfRightDiamond = line.indexOf('>');
                initialTag = line.substring(indexOfLeftDiamond+1, indexOfRightDiamond);
                line = line.replace("<", "");

                int indexOfDash = line.indexOf("/", indexOfRightDiamond);
                int indexOfLastDiamond = line.lastIndexOf(">");

                String finalTag = line.substring(indexOfDash + 1, indexOfLastDiamond);
                String textToPrint = line.substring(indexOfRightDiamond, indexOfDash);

                if (!initialTag.equals(finalTag)) {
                    System.out.println("None");
                } else {
                    System.out.println(textToPrint);
                };
            }
            testCases--;
        }
    }
}