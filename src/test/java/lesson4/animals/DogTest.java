package lesson4.animals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DogTest {
    @Test
    public void testDog(){

        Dog dog = new Dog("Polkan");
        Dog bar = new Dog("Barbos");
        assertEquals("Gaf", dog.greets());
        assertEquals("GafGaf", dog.greets(bar));

    }
}
