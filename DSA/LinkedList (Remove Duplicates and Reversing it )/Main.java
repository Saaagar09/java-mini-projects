import java.util.LinkedList;
import java.util.List;
import java.util.Collections;
class Main {
    public static void main(String[] args) {
        
        LinkedList<Integer> list = new LinkedList<>(List.of(1,2,2,3,3,4,4,5));
        int temp=list.get(0);
        System.out.println("Before: "+list);
        for(int i =1;i<list.size();i++){
            if(temp==list.get(i) ){
                list.remove(i);
                i--;
            }else{
                temp = list.get(i);
            }
        }
        System.out.println("After Duplicates removed: "+list);
        
        LinkedList<Integer> rev = new LinkedList<>();
        for(int i=list.size()-1;i>=0;i--){
            rev.add(list.get(i));
        }
        System.out.print("After reversing : "+rev);
        
    }
}