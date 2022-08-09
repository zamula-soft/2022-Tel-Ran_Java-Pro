package lesson2.inheritance;

public class Person {
    protected String name, address;
    //private - поля видны только в этом классе - recommended
    //protected - поля можно использовать и в студенте

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return String.format("Person [name = %s, address = %s]", name, address);
    }
}
