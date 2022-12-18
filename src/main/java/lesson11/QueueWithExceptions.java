package lesson11;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueWithExceptions {
    public static void main(String[] args) {
        //Data structure Queue - tasks managing
        //let add element at the end of queue or take it away from the beginning - FIFO
        // head and tail
        //API:
        //adding
        // boolean add(String s) - raise exception if no place to put IllegalStateException
        // boolean offer(String s) - true if element inserted, false - if not
        //getting
        //String remove() - gets the first element and delete it from the queue
        //return NoSuchElementException - if no data
        //String pull() - gets the first element and delete it and return null if no data
        //inspection
        //String element() - the first element, otherwise - NoSuchElementException
        //String peek() - the first or null

//        Queue<String> bankQueue = new LinkedList<>();
//        bankQueue.add("Max");
//        bankQueue.add("Nadya");
//        bankQueue.add("Sidor");
//
//        System.out.println(bankQueue.remove());
//        System.out.println(bankQueue.remove());
//        System.out.println(bankQueue.remove());

        PriorityQueue priorityQueue = new PriorityQueue<>(); //by default sort form type to change use comparator
        priorityQueue.add("one");
        priorityQueue.add("two");
        priorityQueue.add("three");
        priorityQueue.add("four");
        priorityQueue.add("five");

        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());

        //Exceptions
        try {
            hello();
        }
        catch (NoSuchElementException e)
        {
            System.out.println("No such element");
        }
        catch (Exception e)
        {
            System.out.println("got an exception " + e.getClass() + " "+ e.getMessage());
        }


    }

    public static void hello() throws NoSuchElementException {
        Queue<String> bankQueue = new LinkedList<>();
        bankQueue.add("Max");
        bankQueue.add("Nadya");
        bankQueue.add("Sidor");

        System.out.println(bankQueue.remove());
        System.out.println(bankQueue.remove());
        System.out.println(bankQueue.remove());

//        System.out.println(bankQueue.remove());
        throw new IllegalArgumentException("text");
    }
}
