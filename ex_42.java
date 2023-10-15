import java.util.Array;
import java.util.Scanner;
public class ex_42{
   
    
    
    
    
    public static void printing(int a[])
    {
         for(int i=0; i<a.length; i++)
         {
            
             System.out.println(a[i]);
         }

    }
   
   
   
   
   
    public static void main(String[] lol)
    {     Scanner sc= new Scanner(System.in);
         int a[]= new int[10];
         
         for(int i=0;i<6;i++)
         {
             a[i]=sc.nextInt();
         }
         
         
         
         int b[]=Array.clone(a,10);
              printing(a);

              printing(b);
    }
     
}