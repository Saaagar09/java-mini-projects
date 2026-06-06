

class Main {

    public static void main(String[] args) {

        int[] array = {10,5,6,20,55,25};
        int largest = array[0];
        int secondLargest = array[0];
        
        for(int i=1;i<array.length;i++){
            if(array[i]>largest){
                secondLargest = largest;
                largest=array[i];
            }else if(array[i] > secondLargest && array[i] != largest){
                secondLargest = array[i];
            }
        }
        
        
        System.out.println("Largest Element is: "+ largest);
        System.out.println("Second Largest Element is: "+ secondLargest);
    }

}