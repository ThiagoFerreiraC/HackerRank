package HackerRank;

import java.util.*;

public class Java_Generics {

    public static void main(String[] args) {
        Integer[] numbers = {1,2,3};
        String[] words = {"Hello", "World"};
        printArray(numbers);
        printArray(words);

    }

    public static <T> void printArray(T[] s) {
        Arrays.stream(s).forEach(System.out::println);
    }
}
