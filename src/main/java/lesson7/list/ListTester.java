package lesson7.list;


import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListTester {
    public static void main(String[] args) {
        //Iterators
        //foreach

        int[] a = {10, 20, 30, 40};
        List<Integer> b = Arrays.asList(10, 20, 30, 40);

        for (int i = 0; i < a.length; i++) {
            System.out.println("fori " + a[i]);
        }

        for (int i : b) {
            System.out.println("for each " + i);
        }

        MyList list = new MyListSimpleImplementation();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("list " + list.get(i));
        }

        // iterator - указывает на элемент котейнера
        // boolean hasNext() - есть следующий
        // int next() получить следующее значение

        Iterator<Integer> myIterator = list.iterator();
        while (myIterator.hasNext())
        {
            System.out.println("Iter "+myIterator.next());
        }

        for(int i: list) // iterable interface
        {
            System.out.println("MyList "+ i);
        }
    }
}
