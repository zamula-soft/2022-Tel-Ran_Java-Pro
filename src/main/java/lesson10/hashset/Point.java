package lesson10.hashset;

import java.util.Objects;

public class Point implements Comparable<Point> {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;
    }

    @Override
    public int hashCode() {
        int result = x;
        result = 31 * result + y;
        return result;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    //if this less object o we need to return digit < 0, if the same - return 0, else digit > 0
    @Override
    public int compareTo(Point o) {
        if (x != o.x)
            return x - o.x;
        if (y != o.y)
            return y - o.y;
        return 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
