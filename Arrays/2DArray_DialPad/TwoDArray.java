public class TwoDArray{
    public static void main(String[] args){
        System.out.print("2 D Array Dial Pad ");
        System.out.println();
        char[][] telephone = {
                {'1','2','3'},
                {'4','5','6'},
                {'7','8','9'},
                {'*','0','#'}

        };
        for(char[] pad : telephone){
            for(char pd : pad){
                System.out.print(pd+" ");
            }
            System.out.println();

        }
    }
}