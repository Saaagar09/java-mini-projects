
/*Function : it is a predefined functional interface which takes one input and perform an  operation and return result . we need to pass number of arguments for type Function<T,R>;
its abstract method is apply();*/

import java.util.function.Function;
class Main{
    public static void main(String [] args){
        Function<String,Integer> fun = x-> x.length(); // passedd the Types for input and the output result 

        System.out.println(fun.apply("Example of Function")); // return the length of the passed String 


    }
}