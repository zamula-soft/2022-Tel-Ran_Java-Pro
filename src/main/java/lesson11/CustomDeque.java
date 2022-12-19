package lesson11;

//Deque - Double Ended Queue - two ends, gives an ability to get values from both sides
public interface CustomDeque {
    void addFirst(int i);
    int getFirst() throws IndexOutOfBoundsException;
    int removeFirst() throws IndexOutOfBoundsException;

    void addLast(int i);
    int getLast() throws IndexOutOfBoundsException;
    int removeLast() throws IndexOutOfBoundsException;

    int size();

    String toString();

}
