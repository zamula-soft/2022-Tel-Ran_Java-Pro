package lesson13.homework;

import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private int age;
    private int salary;

    public Employee (int id, String name, int age, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }


    @Override
    public int compareTo(Employee employee) {
        return Integer.compare(this.getId(), employee.getId());
    }

    public static class EmployeeSalaryComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee employee1, Employee employee2) {
            return Integer.compare(employee1.getSalary(), employee2.getSalary());
        }
    }

    public static class EmployeeAgeComparator implements Comparator<Employee>{
        public int compare(Employee employee1, Employee employee2){
            return Integer.compare(employee1.getAge(), employee2.getAge());
        }
    }

    public static class EmployeeNameComparator implements Comparator<Employee>{

        @Override
        public int compare(Employee employee1, Employee employee2) {
            return employee1.getName().compareTo(employee2.getName());
        }
    }







}
