/*
    2.1) Java Program to Count Number of Duplicate Words in String
    2.2) How to Check if the String Contains 'e' in umbrella
*/

import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class _2 {

    //Question 2.1
    static void duplicateWords(String inputString) {
        // Splitting inputString into words
        final String[] words = inputString.split(" ");

        // Creating one HashMap with words as key and their count as value
        final Map < String, Integer > wordCount = new HashMap <> ();

        // Checking each word
        for (String word: words) {
            // whether it is present in wordCount
            if (wordCount.containsKey(word)) {
                // If it is present, incrementing it's count by 1
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                // If it is not present, put that word into wordCount with 1 as
                // it's value
                wordCount.put(word, 1);
            }
        }

        // Extracting all keys of wordCount
        final Set < String > wordsInString = wordCount.keySet();

        // Iterating through all words in wordCount

        for (String word: wordsInString) {
            // if word count is greater than 1

            if (wordCount.get(word) > 1) {
                // Printing that word and it's count
                System.out.println(word + " : " + wordCount.get(word));
            }
        }
    }

    // Question 2.2
    static boolean containE(String s){
        int eCount = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'e'){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        /*Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        duplicateWords(s);*/

        System.out.println(containE("Soham"));
    }
}