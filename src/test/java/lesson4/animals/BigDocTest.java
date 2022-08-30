package lesson4.animals;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BigDocTest {

    @Test
    public void testBigDog(){

        BigDog dog = new BigDog("Polkan");
        Dog bar = new Dog("Barbos");
        BigDog max = new BigDog("Max");
        assertEquals("GAF", dog.greets());
        assertEquals("GAFGAF", dog.greets(bar));
        assertEquals("GAFGAFGAF", dog.greets(max));

    }
}
