package lesson15;

import java.io.StringBufferInputStream;
import java.security.KeyStore;
import java.util.*;

public class MapTester {
    public static void main(String[] args) {

        //MAP
        //get value by key V get(V)
        //put(V)
        //remove(V)

        Map<String, String> capitals = new HashMap<>();
        capitals.put("Germany", "Berlin");
        System.out.println(capitals.get("Germany"));
        System.out.println(capitals.get("Belgium"));
        System.out.println(capitals.size());
        capitals.put("GB", "London");

        Iterator<Map.Entry<String, String>> it = capitals.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> e = it.next();
            System.out.println(e.getKey() + ":" + e.getValue());
        }

        String string = "perform the given action for each for entry in this map all until all entries have been";
        printWordFrequency(string);

        /* HashMap - HashContainer - Objects with the same hashCode
        class Entry{
        K key;
        v value
        Entry next
        }

        hashCode - object into int

        Object.hashCode() - by default address in memory

        to get hashCode
        we have array source[Integer]
        source.length = 9
        Entry.key % 9 = 6 -> Entry with the key 123 goes to cell[5] in source array.
        The cell is bucket!
        hashCode - > bucket - > element
        methods hashMap - get(), put(), remove()

         */

    }

    public static void printWordFrequency(String s) {
        Map<String, Integer> words = new HashMap<>();
        String[] w = s.split(" ");
        for (String word : w) {
            Integer number = words.get(word);
            if (number != null) {
                words.put(word, ++number);
            } else {
                words.put(word, 1);
            }
        }
        Set<String> keys = words.keySet();
        for (String word : keys) {
            System.out.println(word + ":" + words.get(word));
        }

    }
}
