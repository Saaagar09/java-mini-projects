/* LRU least recently used the recent used will go to end ! and least recently used will come at top ;
*/

import java.util.LinkedHashMap;

public class LinkedhashMapExample{

    public static void main (String [] args ){
        LinkedHashMap<String,Integer> map = new LinkedHashMap <> (10,0.5f,true); // initial capacity , loadfactor , access order (LRU)

        map.put("sagar",9);
        map.put("vishal",8);
        map.put("rohan",7);
        map.put("rahul",8);
        map.put("naina",7);

        System.out.println(map);

        System.out.println(map.get("sagar"));
        System.out.println(map.get("naina"));
        System.out.println(map.get("sagar"));
        System.out.println(map.get("vishal"));
        System.out.println(map);


    }


}
