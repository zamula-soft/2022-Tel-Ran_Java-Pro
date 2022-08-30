package lesson4.reference;

import org.junit.Test;

public class RefTypeTest {
    @Test
    public void example(){
        Person p = new Person("Max");
        System.out.println("bef " + p.getName());
        modify(p);
        System.out.println("aft "+p.getName());

    }

    public static void modify(Person d){
        d.setName("Alex");
        System.out.println("In "+d.getName());
    }
}
