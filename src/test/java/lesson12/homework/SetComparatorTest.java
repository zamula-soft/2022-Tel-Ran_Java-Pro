package lesson12.homework;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SetComparatorTest {

    @Test public void compareNulls(){
        assertTrue(SetsComparator.checkSets(null, null));
    }

    @Test public void compareEmptySets(){
        assertTrue(SetsComparator.checkSets(new HashSet<String>(), new HashSet<String>()));
    }

    @Test public void compareNonEmptySets(){
        Set<String> s1 = new HashSet<>(Arrays.asList("One", "Two", "Three"));
        Set<String> s2 = new HashSet<>(Arrays.asList("Three", "One", "Two"));
        assertTrue(SetsComparator.checkSets(s1, s2));
        Set<String> s3 = new HashSet<>(Arrays.asList("Three", "One"));
        assertFalse(SetsComparator.checkSets(s1, s3));
        Set<String> s4 = new HashSet<>(Arrays.asList("Five", "One", "Two"));
        assertFalse(SetsComparator.checkSets(s1, s4));

    }

    @Test public void compareSameObject(){
        Set<String> s1 = new HashSet<>(Arrays.asList("Three", "One", "Two"));
        assertTrue(SetsComparator.checkSets(s1,s1));
    }

}
