package lesson4.reference;

import org.junit.Test;

public class ChangeRefTest {
    @Test
    public void example(){
        Person p = new Person("Max");
        System.out.println("bef " + p.getName());
        modify(p);
        System.out.println("aft "+p.getName());

    }

    public static void modify(Person p){
        p = new Person("Alex");
        //p.setName("Alex");
        System.out.println("In "+p.getName());
    }
}
