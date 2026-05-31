import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Readingfile {
    public static void main(String[] args) {
        String path = "C:\\Users\\sagar\\OneDrive\\Desktop\\test.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            System.out.println("File is present at location\n" + path);
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            System.out.println("file is not present !");
        } catch (IOException e) {
            System.out.println("something went Wrong !");
        }
    }
}
