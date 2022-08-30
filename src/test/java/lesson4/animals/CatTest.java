package lesson4.animals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatTest {
    @Test
    public void testCat(){

        Cat cat = new Cat("Murz");
        assertEquals("Meow", cat.greets());


    }
}
