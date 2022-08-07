package lesson1.lesson1HomeWork;

import lesson1.lesson1HomeWork.Color;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestColor {
    @Test
    public void checkColor(){
        Color color = new Color(0,255,255);
        assertEquals(180, color.getH(), 0.01);
        assertEquals(1, color.getS(), 0.01);
        assertEquals(0.5, color.getL(),0.01);
    }


}
