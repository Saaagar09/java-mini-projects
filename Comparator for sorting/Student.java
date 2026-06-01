public class Student {
    private int age, marks;
    private String name;

    Student(int age, int marks, String name) {
        this.age = age;
        this.marks = marks;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMarks() {
        return marks;
    }
}