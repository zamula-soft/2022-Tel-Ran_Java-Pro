package lesson2.inheritance;

public class TestPerson {

    public static void main(String[] args) {
        Person student = new Student("Max Kotkov", "Main Str", "Music", 3);
        //ссылка на базовый класс
        Person staff = new Staff("Timur", "Nikolaev", "Philosophy", 20_000);

        System.out.println(staff.getName());
        System.out.println(student.getAddress());

        staff = student;

        System.out.println(staff instanceof Student);

        System.out.println(
                ((Student) staff).getProgram()
        );

        System.out.println(staff instanceof Staff);

        Staff st1 = (Staff)  staff;

        //ClassCasException
        System.out.println(st1.getFaculty());

    }
}
