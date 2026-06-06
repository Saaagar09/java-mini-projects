

class Main {

    public static void main(String[] args) {
      
      //Reversing a string
      String a ="Hello World";
      String rev="";
      /*as we can access string thought the index value
      we will start loop from end */
      for(int i = a.length()-1; i >=0;i--){
          rev = rev + a.charAt(i);// using string charAt() method getting single character
      }
       System.out.print("After Reversed : "+rev);
    }

}