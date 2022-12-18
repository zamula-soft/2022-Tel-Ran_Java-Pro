package lesson11;

public class CustomArrayDeque implements CustomDeque{

    private int [] source;//contains
    private int size = 0;  //size of container
    private int firstElementIndex = 0; // to quickly delete and add element in the beginning

    private static final int CAPACITY = 4;
    CustomArrayDeque(){
        source = new int[CAPACITY];
    }

    @Override
    public void addFirst(int i) {
        if (size == source.length){
            increaseCapacity(); //new array with 2*length and copy all elements
            firstElementIndex = (firstElementIndex - 1 + source.length) % source.length;
            //the previous is equal to
            //     if (firstElementIndex == 0)  firstElementIndex = source.length - 1;
            //     else  firstElementIndex = firstElementIndex - 1;
            source[firstElementIndex] = i;
            size++;
        }
    }

    private void increaseCapacity() {
        int [] newSource = new int[source.length * 2];

        int j = 0; // index in new array
        //all elements from first index till the end of array
        for (int i = firstElementIndex; i < source.length; i++) {
            newSource[j++] = source[i];
        }
        //all the rest values from 0 till first index
        for (int i = 0; i < firstElementIndex; i++) {
            newSource[j++] = source[i];
        }

        firstElementIndex = 0;
        source = newSource;
    }

    @Override
    public int getFirst() {
        if (size == 0)
            throw new IndexOutOfBoundsException();
        return source[firstElementIndex];
    }

    @Override
    public int removeFirst() {
        // get first element
        // increase first index + 1
        // size -1
        if (size == 0)
            throw new IndexOutOfBoundsException();
        int firstElement = source[firstElementIndex];
        firstElementIndex = (firstElementIndex + 1) % source.length; // to be in circle
        size--;
        return firstElement;
    }

    @Override
    public void addLast(int i) {

    }

    @Override
    public int getLast() {
        return 0;
    }

    @Override
    public int removeLast() {
        return 0;
    }

    @Override
    public int size() {
        return size;
    }
}
