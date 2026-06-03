import java.util.LinkedList;

public class LinkedlistDemo {
   public static void main(String[] args) {

       LinkedList<String> ll = new LinkedList<>();

       ll.add("Apple");
       ll.add("Mango");
       ll.add("banana");
       ll.add("coconut");
       System.out.println("Size Of LinkedList:  "+ll.size());
       System.out.println("Before Elements were: "+ll);
       ll.removeIf(fruit-> fruit.startsWith("A"));
       ll.add(2,"Apple");
       ll.add(2,"Orange");
       System.out.println("Elements are: "+ll);
       System.out.println("Size Of LinkedList:  "+ll.size());

    }

}
