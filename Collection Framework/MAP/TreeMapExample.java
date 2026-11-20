import java.util.TreeMap;

public class TreeMapExample{

    public static void main(String[] args) {

        TreeMap<Integer,String> map = new TreeMap<>();

        map.put(1, "kshitiz");
        map.put(2, "sagar");
        map.put(3, "rohan");
        map.put(4, "vishal");
        map.put(5, "nikhil");

        
        System.out.println(map.higherKey(4)); // key strictly greater than given key
        System.out.println(map.lowerKey(3)); // key strictly smaller than given key
        System.out.println(map.ceilingKey(4)); // key greater than or equal to given key
        System.out.println(map.floorKey(3)); // key smaller than or equal to given key
        System.out.println(map.descendingMap()); // decending order sorting 
        
    
}
}
