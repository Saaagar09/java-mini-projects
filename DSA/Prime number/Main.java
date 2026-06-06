
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        boolean isPrime = true;
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to check if its Prime or Not: ");
        num = scanner.nextInt();
        scanner.nextLine();
        if(num<=1){
            System.out.print(num + " Is Not a Prime No ");
            return;
        }
        for(int i =2; i<num;i++){
            if(num%i==0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.print(num+ " Is  a prime no ");
        }else{
            System.out.print(num+ " Is not  a prime no ");
        }
        scanner.close();
    }
}