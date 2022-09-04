package lesson6.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AddressTest {
    @Test
    public void testGetAddresses()
    {
        List<Address> res = Arrays.asList(
                new Address("Mira", "5"),
                new Address("Mira", "12F")
        );

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Ivanov", new Address("Mira", "5")));
        personList.add(new Person("Petrov", new Address("Mira", "12F")));

        assertEquals(res, AddressTester.getAddresses(personList));
    }

@Test
    public void testFilter4()
{
    List<String> s = Arrays.asList("Max", "Smith", "Tandy", "Roger", "Michael", "Alexander");
    List<String> s4 = Arrays.asList("Smith", "Tandy", "Roger", "Michael", "Alexander");
    assertEquals(s4, AddressTester.filter4(s, 4));
}
}
