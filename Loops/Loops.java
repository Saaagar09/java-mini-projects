import java.util.Scanner;


public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int age = 0;
        int num = 0;


        //Example : 1 [ While Loop ]
        // A loop that repeats while the condition is true.
        while (name.isEmpty()) {
            System.out.print("Enter your name :");
            name = scanner.nextLine();

        }

        // Example : 2 [Do-While Loop]
        // A loop that runs at least once before checking the condition
        do {
            System.out.print("Enter your age :");
            age = scanner.nextInt();

        } while (age < 1);
        System.out.println("Hello " + name);
        System.out.println(" You Are " + age + " Years Old ");


        // Example : 3 [for Loop]
        // Repeat code a fixed number of times.
        // A loop used when you know how many times to repeat something

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }


        // printing 1 to 100
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        //Multiplication Table Generator
        System.out.print("Enter Number For Table Generator ");
        int a = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + " * " + i + " = " + a * i);
        }

        // Sum of N Number
        int sum = 0;
        System.out.print("Enter Number : ");
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        if (sum % 2 == 0) {
            System.out.print(" Sum is Even ");
        } else {
            System.out.println("Sum is odd ");
        }
        System.out.print(sum);

        //Factorial Finder
        int fact = 1;
        System.out.print("Enter Number : ");
        int factnum = scanner.nextInt();
        for (int i = factnum; i > 1; i--) {
            fact *= i;
        }
        System.out.println(factnum + "!" + " = " + fact);
        scanner.close();
    }
}
