import java.util.Random; // Random number class
import java.util.Scanner; // user input scanner class

public class NumberGuessingGameUsingDoWhile {
    public static void main(String[] args) {

        // Creating Object and Using Random class to generate random number
        Random random = new Random();

        // variables to be used
        int num, min = 1, max = 100;
        int RandomNum = random.nextInt(min, max + 1);//random method to give range between numbers
        int count = 0; // variable to count no of attempts

        // creating object for scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Number Guessing Game! ");
        System.out.printf("Guess Number Between %d %d ", min, max);

        do {
            System.out.print("Enter Your Number: ");
            num = scanner.nextInt();
            count++;

            if (num < RandomNum) {
                System.out.println("Number is Low Try Again ! ");
            } else if (num > RandomNum) {
                System.out.println("Number is High Try Again ! ");
            } else {
                System.out.println("You Have Won " + num);
                System.out.println("Attempts Taken:  " + count);
            }
        } while (num != RandomNum);

        scanner.close();
    }
}
