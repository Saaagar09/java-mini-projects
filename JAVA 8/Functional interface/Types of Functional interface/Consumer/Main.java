
/*
Consumer : it is a predefined Functional interface which takes an input , perform an operation but do not return anything ;
it has abstract method accept();
*/
import java.util.function.Consumer;

class Main {
    public static void main(String[] args) {

        Consumer<Integer> con = x -> {
            int result = x + 10;
            System.out.println(result);
        };

        con.accept(20);
    }
}