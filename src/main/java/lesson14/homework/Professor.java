package lesson14.homework;

import java.util.ArrayList;
import java.util.List;

public class Professor implements Comparable<Professor> {
    private String name;
    private int salary;
    private List<Student> students = new ArrayList<>();

    public Professor(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Professor(String name, int salary, List<Student> students) {
        this.name = name;
        this.salary = salary;
        this.students = students;
    }

    public void addStudent(Student student){
        if (student != null)
            students.add(student);
    }

    @Override
    public String toString() {
        return getName()+ " " +getStudents().size()+" - "+getSalary();
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public int compareTo(Professor professor) {
        return Integer.compare(this.getSalary(), professor.getSalary());
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
