import java.util.Scanner;

public class BankingProgram {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Declare variables

        double balance;
        char choice;
        boolean isRunning = true;
        System.out.println("Welcome To Banking Program ! ");
        System.out.println("Enter Balance To your Account: ");
        balance = scanner.nextDouble();

        while (isRunning) {
            System.out.println("*********************"); //Display a menu ( pick a choice)
            System.out.println("Choose an option: ");
            System.out.println("1 for Balance: ");
            System.out.println("2 for Withdraw: ");
            System.out.println("3 for Deposit: ");
            System.out.println("4 for Exit: ");
            System.out.println("*********************");
            choice = scanner.next().charAt(0);

            //get and process users choice

            switch (choice) {
                case '1' -> showbalance(balance);
                case '2' -> {
                    balance -= withdraw(balance);
                    System.out.println("Current Balance: " + balance);

                }
                case '3' -> {
                    balance += deposit(balance);
                    System.out.println("Current Balance: " + balance);

                }
                case '4' -> {  //exit()
                    exit();
                    isRunning = false;
                }
                default -> System.out.println("Invalid Option !");
            }

        }

    }

    //Method showbalance()
    static void showbalance(double balance) {
        System.out.println("Your Balance is: " + balance);
    }

    //Withdraw()

    static double withdraw(double balance) {
        double withdraw;
        System.out.println("Enter Amount For Withdrawal: ");
        withdraw = scanner.nextDouble();
        if (withdraw < 0) {
            System.out.println("Invalid Amount Entered! ");
        } else if (withdraw > balance) {
            System.out.println("Withdrawal amount should be less or equal to balance");

        } else {
            System.out.println("Withdrawal success of Amount ! " + withdraw);
            return withdraw;
        }
        return 0;
    }

    //deposite()

    static double deposit(double balance) {
        double deposite;
        System.out.println("Enter Amount For Deposit: ");
        deposite = scanner.nextDouble();
        if (deposite <= 0) {
            System.out.println("Negative or zero amount cannot be deposited! ");
        } else {
            System.out.println("You have deposit Successfully !  " + deposite);

        }
        return deposite;
    }

    //exit()

    static void exit() {
        System.out.println("Thank You ! For Using Our Bank !");

    }
}
