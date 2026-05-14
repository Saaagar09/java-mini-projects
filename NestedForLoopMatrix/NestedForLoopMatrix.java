import java.util.Scanner;

public class NestedForLoopMatric {
    public static void main(String[] args) {

        int column, rows;
        char symbol;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number of Column: ");
        column = scanner.nextInt();
        System.out.print("Enter Number of Rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter your Symbol: ");
        symbol = scanner.next().charAt(0);
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
        scanner.close();
    }
}