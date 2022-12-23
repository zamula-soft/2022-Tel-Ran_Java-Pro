package lesson13.homework;

import java.util.Comparator;

public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private int age;
    private int salsry;

    public Employee (int id, String name, int age, int salsry) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salsry = salsry;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salsry=" + salsry +
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

    public int getSalsry() {
        return salsry;
    }


    @Override
    public int compareTo(Employee employee) {
        return Integer.compare(this.getId(), employee.getId());
    }

    public static class EmployeeSalaryComparator implements Comparator<Employee> {
        @Override
        public int compare(Employee employee1, Employee employee2) {
            return Integer.compare(employee1.getSalsry(), employee2.getSalsry());
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
