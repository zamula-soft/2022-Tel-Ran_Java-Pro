package lesson4.reference;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        //ссылочные типы
        //Class [] @Test interface enum String

        //примитивные типы встроенны в язык и у низх есть значение по умолчанию
        //int boolean
        String c = null;
        Person p = new Person("Max");

        //int - Integer

        int t = 50;
//        Integer a1 = new Integer(t);
        Integer a2 = t; //boxing - инициализация ссылочного типа по примитиву

//        List<int> intList = new ArrayList<>(); //так нельзя тьолько со ссылками
        List<Integer> integerList = new ArrayList<>();

        if (a2 < 200){//unboxing = вытаскиваем примитив из ссылочного типа при сравнении ссылочноготипа с примитивом
            System.out.println("less");
        }

        if (a1 == a2) //эквивалентность ссылки не равны друг-другу
            System.out.println("==");
        else
            System.out.println("!=");

        if (a1.equals(a2))
            System.out.println("==");
    }
}

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
