package lesson7.homework;

// Интерфейс это набор методов, которые должын реализовать
// наследники этого интерфейса
// Контракт, которому должны следовать все его дочерние классы

import java.util.Iterator;

public interface AdvancedArrayList {
    void set(int index, int value);
    int get(int index);
    int size();
    void append(int value);
    void append(int [] a);
    void insert(int index, int value);
    // void insert(int index, int [] a);
    void delete(int index);
    // void delete(int index, int howMany);
    boolean contains(int value);

    Iterator<Integer> iterator();
}

