package lesson10.hashset;

import java.util.Comparator;

public class PointComparator implements Comparator<Point> {

    @Override
    public int compare(Point o1, Point o2) {
        if (o1.getX() != o2.getX())
            return o1.getX() - o2.getX();
        if (o1.getY() != o2.getY())
            return o1.getY() - o2.getY();
        return 0;
    }
}
