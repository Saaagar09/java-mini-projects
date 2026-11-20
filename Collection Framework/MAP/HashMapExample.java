

import java.security.Key;
import java.util.HashMap;
import java.util.Map;
class HashMapExample{
public static void main(String[] args) {
    
    HashMap<Integer,String> map = new HashMap<>();

    map.put(1, "sagar");
    map.put(2, "Rohan");
    map.put(3, "kashish");
    map.put(4, "Mehak");

    String find = map.get(2);



/*iteration on map using entryset()
for(Map.Entry<Integer,String> stu : map.entrySet()){
    System.out.print("Key: " + stu.getKey()+ " ");
    System.out.println("Value: " + stu.getValue());

} */

    // iterating using lambda expression forEach((K,V)->{});

    map.forEach((Rollno,Name) -> {

        System.out.println(Rollno+" "+Name);
    });
 
}

}
