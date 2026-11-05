/*
BiPredicate : It is a Functional interface which Takes 2 input and return a boolean  result 
abstract method is test(Tt,Uu)
*/

import java.util.Scanner;
import java.util.function.BiPredicate;

class Main {
    public static void main(String[] args) {

        BiPredicate<Integer,Integer> biPredicate = (x, y) -> {
            if (x > y) {
                System.out.println(x + " is Greater");
                return true;
            } else if (x < y) {
                System.out.println(y + " is Greater");
                return true;

            } else {
                System.out.println("Both values are equal");
                return false;
            }
        };

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 values");
        int val1 = scanner.nextInt();
        int val2 = scanner.nextInt();
        scanner.close();

                System.out.println(biPredicate.test(val1, val2));
    }
}