package lesson14.homework;

public class Student {

    public enum Subjects{
        Linux, Java, FrontEnd, Algorithms
    }

    String name;
    int age;
    Subjects subjects;

    public Student(String name, int age, Subjects subjects) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }
}
