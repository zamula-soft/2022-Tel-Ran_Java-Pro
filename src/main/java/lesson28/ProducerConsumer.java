package lesson28;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ProducerConsumer {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(List.of(1,2,3,4,5));
        printListOfNumbers(integerList);

    }

    public static void printListOfNumbers(List<? extends Number> numberList){ // number and all child class - consumer
        numberList.forEach(
                n -> System.out.println("number" + n)
        );
    }

//    public static void addNumbers(List<Integer> integerList){
public static void addNumbers(List<? super Integer> integerList){ //producer - can change
        integerList.add(new Random().nextInt());
    }

}
