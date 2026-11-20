/* it compares keys using reference equality  (==) instead of normsl object equality   .equals()
*/

import java.util.IdentityHashMap;

public class IdentityHashMapExample {
    public static void main(String[] args) {

        // used these objects as  keys 
        String s1 = new String("java");
        String s2 = new String("java");

        IdentityHashMap<Object,String> map = new IdentityHashMap <> ();

        map.put(s1, "S1");
        map.put(s2, "S2");

        System.out.println(map);
        System.out.println(map.size());
    }
}