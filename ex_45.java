import java.util.Arrays;
import java.util.Scanner;
public class ex_45{
   public static void printing(int a[])
    {
         for(int i=0; i<a.length; i++)
         {
            
             System.out.println(a[i]);
         }

    }
    public static void main(String[] lol)
    {     Scanner sc= new Scanner(System.in);
         int a[]= new int[6];
         
         for(int i=0;i<6;i++)
         {
             a[i]=sc.nextInt();
         }
           sc.close();
         int b[]=Arrays.copyOf(a,a.length);
            System.out.println("original array");  
            printing(a);
            System.out.println("new array");
              printing(b);
    }
     
}