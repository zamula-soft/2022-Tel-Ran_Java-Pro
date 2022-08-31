package lesson4.homework;

import lesson4.lines.Figure;
import lesson4.lines.Point;

import java.util.ArrayList;
import java.util.List;

public class Rectangle implements Figure {

    private List<Point> points = new ArrayList<>();

    public Rectangle(List<Point> points) {
        this.points = points;
    }

//    private double getLength(Point p0, Point p1){
//        return Math.sqrt(
//                Math.pow((p1.getX() - p0.getX()),2) + Math.pow((p1.getY() - p0.getY()),2)
//        );
//    }

//    @Override
//    public double getLength() {
//        double figLength = 0;
//        for (int i = 0; i < points.size()-1; i++) {
//            figLength += getLength(points.get(i), points.get(i+1));
//        }
//        return figLength + getLength(points.get(points.size()), points.get(0));
//    }


    @Override
    public double getLength() {
        double l = 0;
        for (int i = 0; i < points.size(); i++) {
            if (i != points.size()-1)
                l += points.get(i).getLength(points.get(i+1));
            else
                l+=points.get(i).getLength(points.get(0));
        }
        return l;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "points=" + points +
                '}';
    }
}
