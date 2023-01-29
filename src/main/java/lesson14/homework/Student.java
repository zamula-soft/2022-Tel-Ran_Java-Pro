package lesson14.homework;

public class Student {

    public enum Subjects{
        Linux, Java, FrontEnd, Algorithms
    }

    private String name;
    private int age;
    private String subjects;

    public Student(String name, int age, String subjects) {
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

    public String getSubjects() {
        return subjects;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }
}
