import java.util.Scanner;

public class area_of_rectangle {
    public static void main(String[] args) {
        /* Calculating area of a rectangle*/
        double Length;
        double Breadth;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Length of Rectangle: ");
        Length = scanner.nextDouble();
        System.out.print("Enter Breadth of Rectangle: ");
        Breadth = scanner.nextDouble();
        scanner.close();
        System.out.print("Area of Rectangle is : " + Length * Breadth);
        scanner.close();
    }
}