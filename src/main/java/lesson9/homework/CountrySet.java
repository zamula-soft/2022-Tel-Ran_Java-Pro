package lesson9.homework;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CountrySet {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>(Arrays.asList("Andorra", "Belize", "Cayman", "France", "Argentina", "Cuba", "Sweden"));
        Set<String> words = new HashSet<>(Arrays.asList("Andorra", "Canada", "First", "candy", "Argentina", "wood", "parrot", "cat", "Alan"));
        Set<String> result = new TreeSet<>();
        for (String word :words) {
            if (countries.contains(word) && word.charAt(0) == 'A'){
                result.add(word);
            }

        }
        System.out.println(result);
    }



}
