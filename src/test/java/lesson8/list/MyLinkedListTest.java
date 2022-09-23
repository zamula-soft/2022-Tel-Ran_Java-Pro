package lesson8.list;

import org.junit.Test;

import java.util.Iterator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MyLinkedListTest {
    @Test
    public void testLinkedListTest()
        {
        MyLinkedList l = new MyLinkedList();
        assertEquals(0, l.size());
        l.add(1);
        l.add(2);;
        l.add(3);;
        assertEquals(3, l.size());
        assertEquals(2, l.get(1));
        assertTrue(l.contains(2));
        l.set(2,4);
        assertTrue(l.contains(4));
        l.set(2, 22);
        assertEquals(22, l.get(2));
        l.add(2,33);;
        assertEquals(33, l.get(3));
    }

    @Test
    public void headRemove()
    {
        MyLinkedList l = new MyLinkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.remove(0);
        assertEquals("[20, 30]", l.toString());
    }

    @Test
    public void testRemove()
    {
        MyLinkedList l = new MyLinkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.remove(1);
        assertEquals("[10, 30]", l.toString());
    }

    @Test
    public void tailRemove()
    {
        MyLinkedList l = new MyLinkedList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.remove(2);
        assertEquals("[10, 20]", l.toString());
    }

    @Test
    public void testIterator(){
        MyLinkedList l = new MyLinkedList();
        l.add(10);
        l.add(20);
        l.add(30);

        Iterator<Integer> i = l.iterator();
        assertTrue(i.hasNext());
        i.remove();
        assertEquals("[20, 30]", l.toString());
        assertTrue(i.hasNext());
        i.remove();
        assertEquals("[30]", l.toString());
        assertTrue(i.hasNext());
        i.remove();
        assertEquals("[]", l.toString());
    }
}
