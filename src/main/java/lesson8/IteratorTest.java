package lesson8;

import java.util.*;

public class IteratorTest {
    public static void main(String[] args) {
        int[] l = {1,2,3};

        //iterator - интерфейс
        //позволяет обойти все элементы любого класса
        //который имплементит Iterable

        List<String> names = new ArrayList<>();
        names.add("Max");
        names.add("Oxana");

        Iterator<String> arrayIterator = names.iterator(); //метод из Iterable
        while (arrayIterator.hasNext()) //метод из Iterator
            System.out.println(arrayIterator.next()); //методы из Iterator

        Set<String> countries = new HashSet<>();
        Set<String> capitals = new TreeSet<>();

        countries.add("France");
        countries.add("Canada");
        countries.add("USA");

        Iterator<String> setIterator = countries.iterator();
        while (setIterator.hasNext())
            System.out.println(setIterator.next());
    }
}
