import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        //Fahrenheit to Celcius: C = (F-32) (5/9)
        //Celsius to Fahrenheit: F = C(9/5) + 32
        System.out.println("Temperature Conversion Program: ");
        Scanner scanner = new Scanner(System.in);
        double temp;
        double newtemp;
        String option;
        System.out.print("Enter Temperature: ");
        temp = scanner.nextDouble();
        System.out.print("Convert To Celsius or Fahrenheit ? (C or F): ");
        option = scanner.next().toUpperCase();
        // (condition) ? ifTrue : ifFalse ;
        newtemp = (option.equals("C")) ? (temp - 32.0) * 5.0 / 9.0 : (temp * 9.0 / 5.0) + 32.0;
        System.out.print("Your Temperature is :" + newtemp + " " + option);
        scanner.close();
    }
}
