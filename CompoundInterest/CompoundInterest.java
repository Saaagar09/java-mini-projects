import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter Principal: ");
        double P = sc.nextDouble();

        System.out.print("Enter Rate of Interest (in %): ");
        double r = sc.nextDouble() / 100;

        System.out.print("Enter Time (in years): ");
        double t = sc.nextDouble();

        System.out.print("Enter number of times interest is compounded per year : ");
        int n = sc.nextInt();

        // Formula: A = P(1 + r/n)^(n*t)
        double A = P * Math.pow((1 + r / n), n * t);

        // Compound Interest
        double CI = A - P;

        // Output
        System.out.println("Final Amount = " + A);
        System.out.println("Compound Interest = " + CI);

        sc.close();
    }
}
