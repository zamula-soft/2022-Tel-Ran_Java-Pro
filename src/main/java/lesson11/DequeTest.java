package lesson11;

import java.util.Arrays;
import java.util.Iterator;

public class DequeTest {
    public static void main(String[] args) {
        CustomArrayDeque d = new CustomArrayDeque();
        d.addFirst(50);
        d.addFirst(40);
        d.addFirst(30);
        d.addFirst(20);
        d.addFirst(10);

        System.out.println(d);

        Iterator<Integer> backwardIterator = d.getBackwardsIterator();
        while (backwardIterator.hasNext())
            System.out.println(backwardIterator.next());


        CustomArrayDeque newCAD = new CustomArrayDeque();
        newCAD.addFirst(10);
        newCAD.addFirst(5);
        newCAD.addFirst(50);
        newCAD.addFirst(2);

        int a[] = {25,2,50,5,10};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        //Backward Iterator is inside class in CustomDeque - we need to create it as part of CAD class
        //SORT with list
        //1 var
//        Iterator<Integer> bigToSmallIterator = newCAD.new BackwardIterator();
        //2 var
        Iterator<Integer> bigToSmallIterator = newCAD.getPrivateIterator();

        while (bigToSmallIterator.hasNext())
            System.out.println(bigToSmallIterator.next());

    }
}
