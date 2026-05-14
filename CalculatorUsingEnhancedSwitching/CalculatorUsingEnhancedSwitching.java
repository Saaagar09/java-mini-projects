import java.util.Scanner;

public class CalculatorUsingEnhancedSwitching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, result;
        char operator;

        System.out.println("Calculator:");
        System.out.print("Enter your first number: ");
        a = scanner.nextDouble();

        System.out.print("Enter your second number: ");
        b = scanner.nextDouble();

        System.out.print("Choose an operation (+, -, *, /, %): ");
        operator = scanner.next().charAt(0);

        //Enhanced Switch case updated in java17 & Onwards
        switch (operator) {
            case '+' -> result = a + b;
            case '-' -> result = a - b;
            case '*' -> result = a * b;
            case '/' -> {
                if (b == 0) {
                    System.out.println("Cannot divide by zero!");
                    return;
                }
                result = a / b;
            }
            case '%' -> {
                if (b == 0) {
                    System.out.println("Cannot find remainder with zero!");
                    return;
                }
                result = a % b;
            }
            default -> {
                System.out.println("Please choose a correct option!");
                return;
            }
        }

        System.out.println("Result = " + result);
        scanner.close();
    }
}
