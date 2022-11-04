package lesson10.homework;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class DuplicateSearch {

    public static void main(String[] args) {
        String string = "Website texts are texts that are created especially for use on the Internet. " +
                "Text is the most important part of most websites – " +
                "even ahead of other formats such as image and video. " +
                "Various features distinguish website texts from other types of texts. " +
                "These include a specific HTML design and search engine optimization."
                ;

        System.out.println(getDuplicates(string));

    }//main

    public static Collection<String> getDuplicates(String s)
    {
        s = s.toLowerCase();
        s = s.replaceAll(".", "");
        s = s.replaceAll(",", "");
        String [] tokens = s.split(" ");

        Set<String> words = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String w: tokens)
        {
            if (words.contains(w))
                duplicates.add(w);
            else
                words.add(w);

        }

        return duplicates;
    }

}
