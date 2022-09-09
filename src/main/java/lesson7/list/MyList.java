package lesson7.list;

import java.util.Iterator;

public interface MyList extends Iterable<Integer>{
    void add (int i);
    void add (int index, int value);
    boolean contains (int value);
    int get (int index);
    void remove (int index);
    int size();
    void set(int index, int value);

    Iterator<Integer> iterator();
}
