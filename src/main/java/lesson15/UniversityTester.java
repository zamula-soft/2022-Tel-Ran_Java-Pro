package lesson15;

import lesson14.homework.Professor;
import lesson14.homework.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UniversityTester {
    public static void main(String[] args) {

        Student s1 = new Student("Max", 25, "music");
        Student s2 = new Student("Masha", 22, "physics");
        Student s3 = new Student("Sam", 21, "persian");

        Professor p1 = new Professor("Laslo", 35_000);
        p1.addStudent(s1);
        p1.addStudent(s3);
        Professor p2 = new Professor("John", 45_000);
        p2.addStudent(s2);


        List<Professor> professors = new ArrayList<>();
        professors.add(p1);
        professors.add(p2);

        System.out.println(professors);
        Collections.sort(professors, (o1, o2) -> Integer.compare(o1.getStudents().size(), o2.getStudents().size()));
        System.out.println(professors);

        //comparable from class
        Collections.sort(professors);
        System.out.println(professors);
        Collections.sort(professors, Comparator.reverseOrder());
        System.out.println(professors);
        Collections.sort(professors, Comparator.comparing(Professor::getName).reversed());
        System.out.println(professors);

    }
}
