

class Main {

    public static void main(String[] args) {

        int[] arr = {10,5,6,20,25};
        int target = 230;
        boolean found = false;
        for(int i =0;i<arr.length;i++){
            if(target==arr[i]){
                System.out.print("Element Found at Index: "+ i);
                found = true;
                break;
            }
        }
        if(!found){
                System.out.print("Element Not Found! ");
        }
    }

}