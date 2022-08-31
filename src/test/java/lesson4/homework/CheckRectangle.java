package lesson4.homework;

import lesson4.lines.Point;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CheckRectangle {
    @Test
    public void checkRectangleLength()
    {
        List<Point> p = new ArrayList<>();
        p.add(new Point(0,0));
        p.add(new Point(1,0));
        p.add(new Point(1,1));
        p.add(new Point(0,1));
        Rectangle r = new Rectangle(p);
        assertEquals(4, r.getLength(), 0.01);
    }
}
