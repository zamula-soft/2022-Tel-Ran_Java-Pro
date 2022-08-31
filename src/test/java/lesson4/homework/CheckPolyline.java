package lesson4.homework;

import lesson4.lines.Point;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CheckPolyline {
    @Test
    public void checkPolylineLength()
    {
        List<Point> p = new ArrayList<>();
        p.add(new Point(0,0));
        p.add(new Point(1,0));
        p.add(new Point(1,1));
        p.add(new Point(0,1));
        PolyLine polyLine = new PolyLine(p);
        assertEquals(3, polyLine.getLength(), 0.01);
    }
}
