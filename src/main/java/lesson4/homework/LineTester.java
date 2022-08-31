package lesson4.homework;

import lesson4.lines.Point;

import java.util.ArrayList;

public class LineTester {
    public static void main(String[] args) {
        PolyLine p = new PolyLine(new ArrayList<Point>());

        p
                .appendPoint(new Point(0, 0))
                .appendPoint(new Point(1, 0))
        ;
    }
}
