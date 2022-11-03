package lesson10.hashset;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTester {
    public static void main(String[] args) {
        //if we want to use hash containers
        //we need to implement functions equals() and hashCode()
        //As far as all classes are from Object class, so Object has equals() and hashCode()
        //1. Object has contract: object.hashCode() is all the same during the whole life of the object - int
        new Object().hashCode(); // int
        //if o1.equals(o2) uit means that o1.hashCode() == o2.hashCode()
        //but if o1.hashCode() == o2.hashCode() doesn't mean that o1.equals(o2)

        //Class that keeps in hash-containers must have equals() and HashCode()
        Set <Point> points = new HashSet<>();
        points.add(new Point(10, 20));
        points.add(new Point(10, 20));

        System.out.println(points);

        //adding new point to hash basket, change values of HashCode()
        Set<Point> newPoints = new HashSet<>();
        Point p = new Point(10,20);
        newPoints.add(p);
        p.setX(1000);
        p.setY(1000);
        newPoints.add(p);


        System.out.println(newPoints);

        points.add(new Point(2,2));
        points.add(new Point(2000, 2000));

        System.out.println(points);
        System.out.println(points.contains(new Point(2000, 2000))); //When use hash containers you can sort elements

        // ! If we decide to keep data in Hash containers, we mustn't change fields that makes change equals or HashCode

        Set<Point> linkedPoints = new LinkedHashSet<>(); //In linkedHasSet elements stored in order of insertion
        linkedPoints.add(new Point(10, 20));
        linkedPoints.add(new Point(2, 2));
        linkedPoints.add(new Point(2000, 2000));

        System.out.println(linkedPoints);

        //To use tree set we must implement comparable into our class
        Set<Point> treePoints = new TreeSet<>(/*new PointComparator()*/); // we may use comparator to order
        treePoints.add(new Point(10, 20));
        treePoints.add(new Point(2, 2));
        treePoints.add(new Point(2000, 2000));


        System.out.println(treePoints);

    }
}
