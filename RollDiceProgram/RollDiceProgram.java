import java.util.Random;
import java.util.Scanner;

public class RollDiceProgram {
    public static void main(String[] args) {

        char choice;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        do {
            int rollDice, totalDice = 0, Highestroll = 0;

            System.out.print("Enter How Many Dices To roll: ");
            rollDice = scanner.nextInt();

            if (rollDice > 0) {
                for (int i = 0; i < rollDice; i++) {
                    int randomNum = random.nextInt(6) + 1;
                    printDice(randomNum);
                    System.out.println("You Rolled: " + randomNum);
                    if (randomNum > Highestroll) {                   // Highest Roll Among different Dice Rolls Counter
                        Highestroll = randomNum;
                    }
                    totalDice += randomNum;
                }
                System.out.println("Highest Roll : " + Highestroll);
                System.out.println("Total Point is : " + totalDice);
            } else {
                System.out.println("Number should be greater than Zero!");
            }

            System.out.print("Want to Roll Dice Again (Y/N): ");
            choice = scanner.next().toUpperCase().charAt(0);

        } while (choice == 'Y');

        System.out.println("Thanks for playing 🎲");
        scanner.close();
    }

    // ASCII Printing For Dice Using Method
    static void printDice(int randomNum) {
        String dice1 = """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;
        String dice3 = """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String dice4 = """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String dice5 = """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String dice6 = """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch (randomNum) {
            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
        }
    }
}
