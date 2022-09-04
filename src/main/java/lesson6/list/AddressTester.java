package lesson6.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddressTester {
    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Ivanov", new Address("Mira", "5")));
        personList.add(new Person("Petrov", new Address("Mira", "12F")));

        for (Address address: getAddresses(personList)) {
            System.out.println(address);
        }
        //Для листа есть
        //создание new
        //доступ по индексу get
        //добавление add, в отл от массивы можно add(i, Person)
        //ищменение set
        //size
        //remove(i)

        List<String> s = Arrays.asList("Max", "Smith", "Tandy", "Roger", "Michael", "Alexander");

        System.out.println(filter4(s,4));


    }

    public static List<String> filter4(List<String> names, int number)
    {
        List<String> res = new ArrayList<>();
        for (String name : names)
        {
            if (name.length() > number)
                res.add(name);
        }
        return res;
    }


    public static List<Address> getAddresses(List<Person> persons)
    {
        List<Address> addresses= new ArrayList<>();

        for (int i = 0; i < persons.size(); i++) {
            addresses.add(persons.get(i).getAddress());
        }
        return addresses;
    }
}
