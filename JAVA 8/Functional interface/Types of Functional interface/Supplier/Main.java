/* Supplier : it is a predefined Fucntional interface which do not accept any input but returns a result ;
its abstract method is  T get();
*/


import java.util.function.Supplier;

class Main {
    public static void main(String[] args) {

        Supplier<String> sup = () -> "This is an Supplier Example Which Do not take any input but provide a Result ";

        System.out.println(sup.get());
    }
}