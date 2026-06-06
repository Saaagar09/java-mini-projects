

class Main {

    public static void main(String[] args) {
      
      // sum of digits 
      int digit = 567;
      int last,sum=0;
       while(digit!=0){
           last = digit%10;
           sum = sum+last;
           digit=digit/10;
       }
       System.out.print("Sum of the Digits are : "+sum);
    }

}