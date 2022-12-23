package lesson13.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EmployeeTester {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(
                Arrays.asList(
                        new Employee(1,"Ivan Ivanov", 25, 25000),
                        new Employee(2, "Sergey Ivanov", 33, 28000),
                        new Employee(2, "Oleg Ivanov", 33, 30000),
                        new Employee(3, "Olga Semenova", 24, 13500),
                        new Employee(4, "Igor Orlov", 56, 48000)
                )
        );

        System.out.println(employees);
        employees.sort(Comparator.comparing(Employee::getAge).thenComparing(Employee::getName));
        System.out.println(employees);

        complexSort(employees, Arrays.asList(new Employee.EmployeeAgeComparator(), new Employee.EmployeeNameComparator()));
    }

    //list comparator
    public static void complexSort(List<Employee> employees, List<Comparator<Employee>> comparators){
        Comparator<Employee> comparator = comparators.get(0);
        for (int i = 1; i < comparators.size(); i++) {
            comparator.thenComparing(comparators.get(i));
        }
        employees.sort(comparator);
    }
}
