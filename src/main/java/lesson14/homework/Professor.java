package lesson14.homework;

import java.util.List;

public class Professor implements Comparable<Professor> {
    String name;
    int salary;
    List<Student> students;

    public Professor(String name, int salary, List<Student> students) {
        this.name = name;
        this.salary = salary;
        this.students = students;
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
        return Integer.compare(this.students.size(), professor.getStudents().size());
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
