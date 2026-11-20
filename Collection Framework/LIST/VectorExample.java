/* Vector: It is Synsconised , uses dynamic array internally , initial capacity and capacity increment can be declared inside constructor , it has method capacity()
*/

import java.util.Vector;

public class VectorExample {
 public static void main(String[] args) {
    
    Vector<Integer> vector = new Vector<>(10,2);
    vector.add(1);
    vector.add(2);
    vector.add(3);
    vector.add(4);
    vector.add(5);
    vector.add(6);
    vector.add(7);
    vector.add(8);
    vector.add(9);
    vector.add(10);
    vector.add(11);
    int capacity = vector.capacity();
    System.out.println(vector);
    System.out.println("Capacity : "+ capacity);
 }
    
}
