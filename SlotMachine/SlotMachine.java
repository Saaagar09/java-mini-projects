import java.util.Random;
import java.util.Scanner;

public class SlotMachine {
    public static void main(String[] args) {

        // java slot machine
        Scanner scanner = new Scanner(System.in);

        // variables
        double balance = 100, bet = 0;
        String PlayAgain = "Y";

        // welcome msg
        System.out.println("Welcome to Slot Machine ! ");
        //condtion if balance is > 0
        while (balance > 0) {
            System.out.print("Enter Bet Amount : ");
            bet = scanner.nextDouble();
            if (bet > balance) {
                System.out.println("Insufficient Funds!  ");
                continue;
            } else if (bet <= 0) {
                System.out.println("Bet must be Greater than Zero !  ");
            } else {
                balance -= bet;
            }

            //calling SpinRow Method
            String[] row = spinRow();
            //Get Payout
            double payout = GetPayout(row, bet);
            if (payout > 0) {
                System.out.println("**************");
                System.out.println("You Won: " + payout);
                System.out.println("**************");
                balance += payout;
                // Total Balance
                System.out.println("Your  Balance : " + balance);
                System.out.println("**************");
                scanner.nextLine();
                System.out.println("Bet Again (Y/N)");
                PlayAgain = scanner.nextLine().toUpperCase();
                if ((!PlayAgain.equals("Y"))) {
                    break;
                }
            } else {
                scanner.nextLine();
                // Total Balance
                System.out.println("Your  Balance : " + balance);
                //Ask To Play Again
                System.out.println("**************");
                System.out.println("You Loose ! Try Again (Y/N)");
                System.out.println("**************");
                PlayAgain = scanner.nextLine().toUpperCase();
            }
            if ((!PlayAgain.equals("Y"))) {
                break;
            }
        }
        //Display Exit Message
        System.out.println("Thanks For Playing This Game ! ");
        scanner.close();
    }

    //SpinRow Method
    static String[] spinRow() {
        String symbols[] = {"🔔", "🍒", "🍉", "⭐", "🍋" };
        String row[] = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = (symbols[random.nextInt(symbols.length)]);
        }
        System.out.println("spinning......");
        System.out.println(row[0] + " | " + row[1] + " | " + row[2]);
        return row;
    }

    static double GetPayout(String[] row, double bet) {
        if ((row[0]).equals(row[1]) && (row[1]).equals(row[2])) {
            System.out.println("**************");
            System.out.println(" JACKPOT ! ");
            System.out.println("**************");
            return switch (row[0]) {
                case "🔔" -> bet * 100;
                case "🍒" -> bet * 80;
                case "🍉" -> bet * 70;
                case "⭐" -> bet * 60;
                case "🍋" -> bet * 50;
                default -> 0;
            };
        } else if ((row[0]).equals(row[1]) || (row[1]).equals(row[2])) {
            return switch (row[0]) {
                case "🔔" -> bet * 5;
                case "🍒" -> bet * 10;
                case "🍉" -> bet * 15;
                case "⭐" -> bet * 20;
                case "🍋" -> bet * 25;
                default -> 0;
            };
        }
        return 0;
    }
}
