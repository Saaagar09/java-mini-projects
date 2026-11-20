/* CopyOnWriteArrayList : it creates a new array whenever modification occurs , it is thread safe useful for read operations .

*/




class CopyOnWriteArrayListExmple{

    public static void main(String[] args) {
        
       CopyOnWriteArrayList<Integer> copylist =
        new CopyOnWriteArrayList<>();
        
        copylist.add("A");
        copylist.add("B");
        copylist.add("C");
        copylist.add("D");
        copylist.add("E");

        System.err.println(copylist);
    }

}