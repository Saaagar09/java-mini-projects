/*Array list : An ArrayList is a collection that stores multiple elements in a single variable,
and its size can automatically increase or decrease when elements are added or removed.*/
import java.util.ArrayList;
import java.util.Collections;
class ArrayListExample{
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        Collections.sort(list,(a,b)->b-a);
        System.out.println(list);
    }
}
