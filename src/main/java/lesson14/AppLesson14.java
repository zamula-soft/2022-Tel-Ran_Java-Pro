package lesson14;

import lesson13.homework.Employee;

import java.util.*;

public class AppLesson14 {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Martha", 24, 21_000);
        Employee e2 = new Employee(10, "John", 34, 12_000);
        Employee e3 = new Employee(12, "Alex", 27, 32_000);
        Employee e4 = new Employee(22, "Bertha", 21, 29_000);
        Employee e5 = new Employee(32, "Sam", 22, 12_000);

        List<Employee> emps = new ArrayList<>();
        emps.addAll(Arrays.asList(e1,e2,e3,e4,e5));

        //get min or max or use it with binary search
        System.out.println(Collections.max(emps, new Employee.EmployeeAgeComparator()));

        //Binary search
        Collections.sort(emps);
        System.out.println(Collections.binarySearch(emps, e3, new Employee.EmployeeSalaryComparator()));


        // if class implements Comparable we can use Collection.sort without Comparator

        //TreeSet<Employee> employees = new TreeSet<>(); //let us keep sorted order
        //as far as Employee class implements Comparable we can use TreeSet without Comparator
        //otherwise we need to set Comparator

        TreeSet<Employee> employees = new TreeSet<>(Comparator.comparing(Employee::getAge).thenComparing(Employee::getName));
        employees.addAll(Arrays.asList(e2,e1,e3,e4,e5));
        System.out.println(employees);

        TreeSet<String> groups = new TreeSet<>(Arrays.asList(
                "Abba",
                "Boney M",
                "Led Zeppeling",
                "Aerosmith",
                "Pearl Jam",
                "ZZ Top"
        ));

        //Treeset - automatically set the order - in the case - alphabetically
        System.out.println(groups);

        //get slice from tree set even without elements
        System.out.println(groups.subSet("CC Catch", "Sandra")); //from CC Catch to Sandra
        System.out.println(groups.tailSet("Fridays")); // all right elements from Fridays
        System.out.println(groups.headSet("Beatles"));


    }


}
