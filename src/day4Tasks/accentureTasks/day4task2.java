package day4Tasks.accentureTasks;
// Write a program which counts how many unique words are in text (see class Text, variable TEXT as a comment here)
//Think of how you could use any of the Set implementation to implement
//this program.

// Bonus:
// Ignore case sensitivity. For example, Apple and apple should be counted as the same word.
//Hint: to get the text as an String array can be regular expression used e.g.: String[] words = Text.TEXT.split("\\s+");


import java.util.*;

public class day4task2 {
    public static void main(String[] args) {
        String lowerCaseText = Text.TEXT.toLowerCase(Locale.ROOT);
        String[] words = lowerCaseText.split("\\s+");
        Set <String> unique = new HashSet<>();
        unique.addAll(List.of(words));
        System.out.println("The number of uniques words is: " + unique.stream().count());
        System.out.println("The words are: " + unique);

}}
