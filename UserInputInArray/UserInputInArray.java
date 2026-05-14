import java.util.Scanner;

public class UserInputInArray {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        //size of array
        int size;
        System.out.print("Enter Size of array: ");
        size = scanner.nextInt();
        scanner.nextLine(); // clearing input buffer

        //declaring array variable
        String[] array = new String[size];

        // loop for assigning elements into array
        for(int i=0;i<size;i++){
            System.out.print("Enter Elements Into Array: ");
            array[i] = scanner.nextLine();
        }
        //printing array elements using join property
            System.out.println("Elements You  Entered Are: ");
            System.out.print(String.join(", ", array));
        scanner.close();
    }
}
