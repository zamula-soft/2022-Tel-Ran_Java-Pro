package lesson7.homework;

import lesson7.homework.AdvancedArrayList;

import java.util.Iterator;

public class MyCustomArrayList implements AdvancedArrayList {
    private static final int INITIAL_CAPACITY = 4;
    private int [] data;
    private int size = 0; //видимый для пользователя размер массива

    public MyCustomArrayList()
    {
        data = new int[INITIAL_CAPACITY];
    }


    @Override
    public void set(int index, int value) {
        data[index] = value;
    }

    @Override
    public int get(int index) {
        return data[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void append(int value) {
        // size
        // data.length
        // когда становится близким то увеличиваем в 2 раза

        if (size == data.length)
            increaseCapacity();
        data[size++] = value;
    }

    private void increaseCapacity() {
        int[] newData = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    @Override
    public void append(int[] a) {
        for (int i = 0; i <a.length ; i++) {
            append(a[i]);
        }
    }

    @Override
    public void insert(int index, int value) {
        for (int i = size-1; i >= index ; i--) {
            data[i+1]=data[i];
        }
        data[index] = value;
        size++;
    }

    @Override
    public void delete(int index) {
        for (int i = index; i < size ; i++) {
            data[i] = data[i+1];
        }
        size--;
    }

    @Override
    public boolean contains(int value) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == value)
                return true;
        }
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            private int position = 0;

            @Override
            public boolean hasNext() {
                return position < size();
            }

            @Override
            public Integer next() {
                return get(position++);
            }

            @Override
            public void remove() {
               delete(position);
            }
        };

    };
}
