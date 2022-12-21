package lesson11.homework;

import lesson11.CustomArrayDeque;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCustomArrayDeque {
    @Test
    public void testAddFirst()
    {
        CustomArrayDeque customArrayDeque = new CustomArrayDeque();
        customArrayDeque.addFirst(10);
        assertEquals(customArrayDeque.size(), 1);
    }

    @Test
    public void testGetFirst()
    {
        CustomArrayDeque customArrayDeque = new CustomArrayDeque();
        customArrayDeque.addFirst(10);
        assertEquals(customArrayDeque.getFirst(), 10);
    }

    @Test
    public void testRemoveFirst()
    {
        CustomArrayDeque customArrayDeque = new CustomArrayDeque();
        customArrayDeque.addFirst(10);
        assertEquals(customArrayDeque.getFirst(), 10);
        int firstValue = customArrayDeque.removeFirst();
        assertEquals(customArrayDeque.size(), 0);
        assertEquals(firstValue, 10);
    }

    @Test
    public void testAddLast()
    {
        CustomArrayDeque customArrayDeque = new CustomArrayDeque();
        customArrayDeque.addFirst(10);
        customArrayDeque.addLast(20);
        assertEquals(customArrayDeque.size(), 2);
        assertEquals("[10, 20]", customArrayDeque.toString());
    }

    @Test
    public void testGetLast()
    {
        CustomArrayDeque customArrayDeque = new CustomArrayDeque();
        customArrayDeque.addFirst(10);
        customArrayDeque.addLast(20);
        assertEquals(customArrayDeque.getLast(), 20);
    }

    @Test
    public void testRemoveLast()
    {
        CustomArrayDeque customArrayDeque = new CustomArrayDeque();
        customArrayDeque.addFirst(10);
        customArrayDeque.addLast(20);
        assertEquals(customArrayDeque.getLast(), 20);
        int lastValue = customArrayDeque.removeLast();
        assertEquals(customArrayDeque.size(), 1);
        assertEquals(lastValue, 20);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testThrowExceptionGettingFirstElementFromEmptyDeque()
    {
        CustomArrayDeque customArrayDeque = new CustomArrayDeque();
        customArrayDeque.getFirst();
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testThrowExceptionGettingLastElementFromEmptyDeque()
    {
        CustomArrayDeque customArrayDeque = new CustomArrayDeque();
        customArrayDeque.getLast();
    }


}
