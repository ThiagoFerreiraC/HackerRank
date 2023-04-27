package HackerRank;

import java.util.Scanner;
import java.util.regex.*;

public class Pattern_Syntax_Checker
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){

            try {
                String pattern = in.nextLine();
                Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (PatternSyntaxException ex ){
                System.out.println("Invalid");
            }
            testCases--;
        }
    }
}



