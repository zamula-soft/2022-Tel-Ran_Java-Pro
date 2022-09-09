package lesson8;

public class DefaultInterfaceImpl implements DefaultInterfaceTest{

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public void introduce(){
        System.out.println("introduce");
    }

}
