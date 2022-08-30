package lesson4.reference;

import org.junit.Test;

public class PrimTypeTest {
    @Test
    public void example(){
        int a = 8;
        System.out.println("Before " + a);
        modify(a);
        System.out.println("After " + a);
        }

    public static void modify(int a){
        a+=100;
        System.out.println("inside "+a);
    }
}
