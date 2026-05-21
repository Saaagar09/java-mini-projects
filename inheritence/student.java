public class student extends person{
    double gpa;
    student(int age,String name , double gpa){
        super(name ,age);
        this.gpa = gpa;
    }
        void showgpa(){
            System.out.println(this.name + " Gpa is: " + this.gpa);
        }
}
