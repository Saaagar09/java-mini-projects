

class Main {

    public static void main(String[] args) {
        //palindrome
        int num =121;
        int original = num;
        int last,rev=0;
        while(num !=0){
          last = num%10; // gives last digit of a number
          
          rev=rev*10+last; // how reverse works = rev*10 creates left space and + last adds digit to it 
          num=num/10; // removes the last digit 
        }
        if(original == rev){
            System.out.println("It is a Palindrome");
        }else{
            System.out.println("It is Not a Palindrome !");
        }
        
        
        
    }

}