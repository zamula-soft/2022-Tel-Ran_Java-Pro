package lesson9.homework;

import java.util.*;

public class CountrySetTester {
    public static void main(String[] args) {
        Set<String> countries = new HashSet<>(
                Arrays.asList("Andorra", "Belize", "Cayman", "France", "Argentina", "Cuba", "Sweden")
        );
        Set<String> words = new HashSet<>(
                Arrays.asList("Andorra", "Canada", "First", "candy", "Argentina", "wood", "parrot", "cat", "Alan", "Cuba")
        );
        //save from words only in countries
        words.retainAll(countries);
        System.out.println(words);

        //del countries not under conditions
        for (String s: words)
        {
//            if (!s.toUpperCase().startsWith("A"))
               //delete from HashSet only from iterator
                // words.remove(s);
        }

        Iterator<String> i = words.iterator();
        while (i.hasNext()){
            if (!i.next().toUpperCase().startsWith("A"))
                i.remove();
        }


        System.out.println(words);

    }



}
