package lesson8.list;

import lesson8.list.DoubleLinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleLinkedListTest {
    @Test
    public void testAdd()
    {
        DoubleLinkedList l = new DoubleLinkedList();
        l.add(10);
        l.add(20);
        assertEquals("[10, 20]", l.toString());
        assertEquals(10, l.get(0));
        l.set(1, 30);
        assertEquals(30, l.get(1));
    }

    @Test
    public void testPosition(){
        DoubleLinkedList l = new DoubleLinkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        assertEquals("[10, 20, 30]", l.toString());

    }
    @Test
    public void testRemove(){
        DoubleLinkedList l = new DoubleLinkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.remove(1);
        assertEquals("[10, 30]", l.toString());
        l.remove(0);
        assertEquals("[30]", l.toString());
    }
}
