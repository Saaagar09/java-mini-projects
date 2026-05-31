import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writingfile {
    public static void main(String[] args) {

        String path = "C:\\Users\\sagar\\OneDrive\\Desktop\\test.txt";

        System.out.println("Enter text to write into file: ");

        try (Scanner scanner = new Scanner(System.in);
             FileWriter file = new FileWriter(path, true)) {

            String content = scanner.nextLine();
            file.write(content + "\n");

            System.out.println("Content written successfully!");

        } catch (IOException e) {
            System.out.println("Cannot write to file!");
        }
    }
}