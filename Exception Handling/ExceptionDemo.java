import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Exception handling practice!");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Enter any Number to divide: ");
                int num = scanner.nextInt();

                System.out.print("Divide by: ");
                int num2 = scanner.nextInt();

                int result = num / num2; //  division added
                System.out.println("Result: " + result);

                break; // exit loop if success

            } catch (InputMismatchException e) {
                System.out.println("Enter numbers only!");
                scanner.nextLine(); // clear wrong input

            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }finally {
                System.out.println("This Will Always Executes! Either Exception happens or not ");
            }
        }

        scanner.close();
    }
}