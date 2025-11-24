package Task2.java;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first word:");
        String firstWord = scanner.nextLine();
        System.out.println("Enter second word:");
        String secondWord = scanner.nextLine();

        char[] word = secondWord.toCharArray();
        Arrays.sort(word);
        char[] thirdWord;

        if(firstWord.length() == secondWord.length()){
            thirdWord = firstWord.toCharArray();
            Arrays.sort(thirdWord);
            if(Arrays.equals(thirdWord, word))
                System.out.println("Words are anagram");
            else
                System.out.println("Words are not anagram");
        }


    }
}
