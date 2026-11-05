
/**
 * Predicates : its a Functional interface in java 8 which is used to check condition and return a boolean value it has a boolean method boolean test(Tt);
 */

import java.util.function.Predicate;

class Main {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x >= 18; // lambda expression of predicate

        boolean age = predicate.test(19); // test method of predicate which provides boolean value 

        if (age == true) {
            System.out.println("You are Eligible to vote");
        }else{
            System.out.println("Age must be 18 or above ");
        }

    }
}
