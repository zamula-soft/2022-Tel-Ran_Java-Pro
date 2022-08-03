package lesson1.geometry;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRectangleArea {

    @Test
    public void testArea(){
        Rectangle rectangle = new Rectangle(
                new Point(1,1),
                new Point(5,5)
        );

        assertEquals(
                16,
                rectangle.getArea(),
                0.0001);
    }
}
