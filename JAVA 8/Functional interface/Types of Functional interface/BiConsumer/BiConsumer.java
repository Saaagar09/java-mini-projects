import java.util.function.BiConsumer;

/**
 * BiConsumer
 */
 class Main {

    public static void main(String [] args){

        BiConsumer<String,String> bicons = (x ,y)-> System.out.println(x+y);
        bicons.accept("Java", "BiConsumer Example");
    }

    
}