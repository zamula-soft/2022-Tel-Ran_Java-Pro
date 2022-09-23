package lesson9;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class steTester {
    public static void main(String[] args) {
        //Java Set implementation
        //set - interface
        // - HashSet - если правильно подобран алгоритм хэшироваия то операция получения значения может быть O(1)
        // - LinkedHashSet - элементы хранятся в порядке вставки FIFO
        // - TreeSet: при обходе по элеиенту возвратяться в порядке сортировки можно взять часть сета

        //проверка уникальности
        //поиск дубликатов

        Set<String> groups = new HashSet<>();
        groups.add("Abba");
        groups.add("Cuns and Roeses");
        groups.add("Jam");
        groups.add("Abba");
        groups.add("Beatles");
        System.out.println(groups.size());
        System.out.println(groups.contains("Beatles"));

        //создать из set массив
        String [] gr = new String[groups.size()];
        groups.toArray(gr);

        for (String s: groups) {
            System.out.println(s);
        }

        TreeSet<String> treeSet = new TreeSet<>(groups);

        for (String s: treeSet) {
            System.out.println(s);
        }

        //вычитание
        treeSet.removeAll(groups);

        //сложение
        treeSet.addAll(groups);

        //находятся ли все элементы сета в другом
        treeSet.containsAll(groups);


        //Task
        String[] words = new String[] {"One", "Two", "Three", "Four", "One", "Five", "Three"};
        Set<String> result = new HashSet<>();
        TreeSet<String> tree = new TreeSet<>();
        for (String word: words
             ) {
            if (tree.contains(word)){
                result.add(word);
            }
            else{
            tree.add(word);}
        }

        System.out.println(result.toString());

        //общие элементы в двух сетах
        tree.retainAll(groups);

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(8);
        numbers.add(11);
        //первые элементы меньше 5
        System.out.println(numbers.headSet(5));

    }
}
