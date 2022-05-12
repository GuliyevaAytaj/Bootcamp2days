package day4Tasks.accentureTasks;
// Write a program which counts how many unique words are in text (see class Text, variable TEXT as a comment here)
//Think of how you could use any of the Set implementation to implement
//this program.

// Bonus:
// Ignore case sensitivity. For example, Apple and apple should be counted as the same word.
//Hint: to get the text as an String array can be regular expression used e.g.: String[] words = Text.TEXT.split("\\s+");


import java.util.Arrays;
import java.util.HashSet;

public class day4task2 {
    public static void main(String[] args) {
        String[] words = Text.TEXT.split("\\s+");
        HashSet<String> uniqueWords = new HashSet<String>(Arrays.asList(words));
        for (String uniq : uniqueWords)
            System.out.println(uniq);
    }
}
