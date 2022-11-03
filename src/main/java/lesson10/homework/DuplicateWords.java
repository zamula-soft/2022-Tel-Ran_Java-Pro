package lesson10.homework;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateWords {
    public static void main(String[] args) {

        String string = "Website texts are texts that are created especially for use on the Internet. " +
                "Text is the most important part of most websites – " +
                "even ahead of other formats such as image and video. " +
                "Various features distinguish website texts from other types of texts. " +
                "These include a specific HTML design and search engine optimization."
                ;

        System.out.println(getDuplicateWords(string));

    }//main

    public static Collection<String> getDuplicateWords (String string)
    {
        String[] words = string.split("\\W+");
        Set<String> wordsSet = new HashSet<>();
        Set<String> duplicateWords = new TreeSet<>();
        for (String word: words) {
            if (wordsSet.contains(word))
                duplicateWords.add(word);
            else
                wordsSet.add(word);


        }

        return duplicateWords;

    }
}
