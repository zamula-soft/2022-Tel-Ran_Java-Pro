package lesson11;

import java.util.*;
import java.util.concurrent.Callable;

public class TestStack {
    public static void main(String[] args) {

        //Stack - add elements from one side and take it form the same side LIFO
        //where to use - Undo, browsers history
        //API
        // T push(T element) -- add to stack
        // T pop() - remove from stack - EmptyStackException
        // T peek() check the last element - EmptyStackException
        // boolean empty()

        Stack<String> names = new Stack<>();
        names.add("Dima");
        names.add("Max");
        names.add("Darya");

        System.out.println(names.pop());
        System.out.println(names.pop());
        System.out.println(names.pop());

        Collection collection = new ArrayList<>();
        collection.add("one");
        collection.add("two");
        collection.add("three");

//        System.out.println(reverse(collection));

        Queue<Integer> ints = new LinkedList<>(Arrays.asList(10,20,30,40,50,60,70,80,90,100));
//        ints.addAll(Arrays.asList(10,20,30,40,50,60,70,80,90,100));
        System.out.println(partialReverse(ints, 3));
    }

    public static Collection<String> reverse (Collection<String> strings){
        Stack<String> stack = new Stack<>();
        stack.addAll(strings);
        Collection<String> result = new ArrayList<>();
        while (!stack.isEmpty()){
            result.add(stack.pop());
        }
        return result;

    }

    // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
    //5
    // [50, 40, 30, 20, 10, 60, 70, 80, 90, 100]
    //add stack 5 elements  from queue
    // stack [50, 40,30, 20, 10]
    // queue [60, 70, 80, 90, 100]
    // from stack add elements into queue
    // queue_new [60, 70, 80, 90, 100, 50, 40,30, 20, 10]
    // from queue with 5 elemnts add next  into queue_new
    // queue_new [70, 80, 90, 100, 50, 40,30, 20, 10, 60]
    // do it 5 times  and get answer
    public static Queue<Integer> partialReverse(Queue<Integer> ints, int number){
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < number; i++) {
            stack.add(ints.remove());
        }

        for (int i = 0; i < number; i++) {
            ints.add(stack.pop());
        }

        for (int i = 0; i < ints.size() - number; i++) {
            ints.add(ints.remove());
        }

        return ints;
    }




}
