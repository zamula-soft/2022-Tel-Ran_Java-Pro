package lesson8.list;

import org.junit.Test;
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
}
