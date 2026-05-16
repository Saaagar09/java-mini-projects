import java.util.Scanner;
class ArraySearch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Size of Array : ");

        int sizeofarray = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter "+ sizeofarray +" Elements :\n" );

        String [] arrays = new String[sizeofarray];

        for(int i = 0 ;i<arrays.length;i++){

            arrays[i] = scanner.nextLine();
        }
        System.out.print("Array Elements Are:\n");
        for(String array : arrays){

            System.out.print(array+" ");
        }
        /*  ***************************************************************** */
        // Searching elements in array
        boolean found = false;
        System.out.print("\n Enter Element Name To Search : ");
        String target = scanner.nextLine();

        for(int i =0;i<arrays.length;i++){
            if(arrays[i].equals(target)){
                System.out.print("Target Found at Index [ "+ i +" ]");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.print("Element Not Found");
        }
        scanner.close();
    }

}