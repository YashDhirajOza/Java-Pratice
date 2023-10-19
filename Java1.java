import java.util.Scanner;

public class Java1 {
    public static int sum (int a){
        if( a>0){
            return a+sum(a-1);
        }
        else{
            return 0;
        }
        }
    public static void main(String[] args) {
       
       Scanner input = new Scanner(System.in);
        System.out.println("Hello");
        int a = input.nextInt();
        System.out.println(sum( a));
    
    
    
    input.close();
    }

}