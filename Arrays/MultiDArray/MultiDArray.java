import java.util.Scanner;

public class MultiDArray{
    public static void main(String[] args){
        //2d array rows and column declaring
        int rows,columns;
        Scanner scanner = new Scanner(System.in);

        //asking user for rows and column for w d array
        System.out.print("How Many rows Do you want in your Array: ");
        rows = scanner.nextInt();
        System.out.print("How Many column Do you  in your Array: ");
        columns = scanner.nextInt();

        System.out.println("Your Array will be : "+rows +" * " + columns);
        scanner.nextLine();
        if(rows!=columns){
            System.out.println("Rows and Columns are not equal. It will create Jagged Array :");
        }
        String[][] MDarr = new String[rows][columns];
        for(int i=0;i<rows;i++){
            for(int j =0;j<columns;j++){
                System.out.println("Enter Element in Index[ "+i+" ] [ "+j+" ]");
                MDarr[i][j]= scanner.nextLine();
            }
        }
        System.out.println("Your Elements Are : ");
        for(String[] arr:MDarr){
            for(String elements:arr){
                System.out.print("[ "+elements+" ]");
            }
            System.out.println();
        }
        scanner.close();
    }

}