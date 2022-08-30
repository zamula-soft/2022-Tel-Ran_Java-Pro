package lesson4.homework;

import lesson4.lines.Figure;
import lesson4.lines.Point;

import java.util.ArrayList;
import java.util.List;

public class PolyLine implements Figure {

    private List<Point> points = new ArrayList<>();

    public PolyLine(List<Point> points) {
        this.points = points;
    }


    @Override
    public double getLength() {
        double figLength = 0;
        for (int i = 0; i < points.size()-1; i++) {
            figLength += getLength(points.get(i), points.get(i+1));
        }
        return figLength + getLength(points.get(points.size()), points.get(0));
    }

    public void appendPoint(Point point) {

        points.add(point);

    }

    private double getLength(Point p0, Point p1){
        return Math.sqrt(
                Math.pow((p1.getX() - p0.getX()),2) + Math.pow((p1.getY() - p0.getY()),2)
        );
    }

    @Override
    public String toString() {
        return "PolyLine{" +
                "points=" + points +
                '}';
    }
}


