

import java.util.LinkedList;

class LinkedListExample{
    static void main(String[] args) {

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Ram");
        list1.add("Sahil kumar");
        list1.add("Ravi");
        list1.add("Anuj jha");
        list1.add("Mehak Sood");
        int L1size = list1.size();

        list1.set(4,"Mehak Sharma"); // Updating element



        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(0);
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.remove(3);
        list2.add(4,3);
        int L2size = list2.size();

        list1.sort((a,b)-> a.compareTo(b)); // using comprator for custom sorting using compareTo() method for string
        list2.sort((a,b)-> b-a);

        System.out.println(list1 + " Size of List " + L1size);
        System.out.println(list2+ " Size of List " + L2size);
    }

}
