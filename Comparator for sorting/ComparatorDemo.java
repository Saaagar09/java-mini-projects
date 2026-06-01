import java.util.*;

public class ComparatorDemo {
    public static void main(String[] args) {

        ArrayList<Student> student = new ArrayList<>();

        student.add(new Student(24, 90, "Sagar"));
        student.add(new Student(22, 88, "Vishal"));
        student.add(new Student(23, 70, "Rahul"));
        student.add(new Student(25, 76, "Happy"));

        //Before
        for (Student stu : student) {
            System.out.println(stu.getName() + " " + stu.getAge() + " " + stu.getMarks());
        }
        System.out.println("***** After Sorting By Marks ! *****");

        // Comparator by marks (ascending order)
        Comparator<Student> comp = Comparator.comparing(Student::getMarks);

        // Sorting
        student.sort(comp);

        for (Student stu : student) {
            System.out.println(stu.getName() + " " + stu.getAge() + " " + stu.getMarks());
        }
    }
}