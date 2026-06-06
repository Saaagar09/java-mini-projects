class Main {

    public static void main(String[] args) {

        int[] array = {10,5,6,20,25};
        int min = array[0];
        int max = array[0];
        for(int i=0;i<array.length;i++){
            if(min > array[i]){ 
                min = array[i]; 
            }if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println("Minimum Element is: "+ min);
        System.out.print("Largest Element is: "+ max);
    }

}