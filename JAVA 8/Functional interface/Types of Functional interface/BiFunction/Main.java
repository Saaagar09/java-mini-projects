
import java.util.function.BiFunction;

class Main{
    public static void main(String [] args){

        BiFunction<Integer,Integer,Integer> bifun = (x,y)-> x*y;

        System.out.println(bifun.apply(5, 10));

    }
}