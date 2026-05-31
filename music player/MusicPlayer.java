import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MusicPlayer {
    public static void main(String[] args) {

        String path = "songs\\CEO - Cheema Y.wav";
        File file = new File(path);
        System.out.println("***** Welcome to Music Player *****");
        try (Scanner scanner = new Scanner(System.in); AudioInputStream audio = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audio);
            String choice = "";
            while (!choice.equals("Q")) {
                System.out.println("\nP = Play | S = Pause | R = Reset | Q = Quit");
                System.out.print("Enter your choice: ");
                choice = scanner.next().toUpperCase();
                switch (choice) {
                    case "P" -> {
                        clip.start();
                        System.out.println("Playing...");
                    }
                    case "S" -> {
                        clip.stop();
                        System.out.println("Paused...");
                    }
                    case "R" -> {
                        clip.setMicrosecondPosition(0);
                        System.out.println("Reset...");
                    }
                    case "Q" -> {
                        clip.close();
                        System.out.println("Stopped...");
                    }
                    default -> System.out.println("Invalid choice !");

                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File Not Found !");
        } catch (IOException e) {
            System.out.println("Input/Output Exception ! ");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("File is Unsupported Please Choose a WAV Format File ! ");
        } catch (Exception e) {
            System.out.println("Something went Wrong !");
        } finally {
            System.out.println("Thanks and Bye !");
        }
    }
}
