package lesson4.lines;

import java.util.ArrayList;
import java.util.List;

public class Triangle implements Figure {
    private List<Point> points = new ArrayList<>();

    public Triangle(List<Point> points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "points=" + points +
                '}';
    }

    //method overloading
//    private double getLength(Point p0, Point p1){
//        return Math.sqrt(
//                Math.pow((p1.getX() - p0.getX()),2) + Math.pow((p1.getY() - p0.getY()),2)
//        );
//    }

    @Override
    //method overriding
    public double getLength() {
        Point p0 = points.get(0);
        Point p1 = points.get(1);
        Point p2 = points.get(2);

        return p0.getLength(p1) + p1.getLength(p2) + p2.getLength(p0);
    }
}
