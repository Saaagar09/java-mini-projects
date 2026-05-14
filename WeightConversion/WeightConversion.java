import java.util.Scanner; // importing package for using scanner to take input from user

public class WeightConversion {
    public void main(String[] args) {

        /* creating scanner object for user input*/

        Scanner scanner = new Scanner(System.in);

        // declaring variables

        double weight;
        double newWeight;
        int option;

        // intro of program

        System.out.println("Weight Conversion Program 🏋");
        System.out.println("Choose an Option for Conversion! ");

        // asking user for options

        System.out.print("Enter 1 for lbs to Kg Conversion: \n");
        System.out.print("Enter 2 for Kg to lbs Conversion: ");

        // assigning option to variable

        option = scanner.nextInt();

        // creating if statement for option 1

        if (option == 1) {
            System.out.println("Enter You Weight In Pounds(lbs): ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.45359237;
            System.out.printf("Weight is %.2f KG", newWeight);
        }

        //creating else if for option 2

        else if (option == 2) {
            System.out.println("Enter You Weight In Kg: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462262;
            System.out.printf("Weight is %.2f lbs", newWeight);
        }

        //creating else statement , if user do not enter 1 or 2 from options

        else {
            System.out.println("You chose Wrong Option: ");
        }
        scanner.close();
    }
}
