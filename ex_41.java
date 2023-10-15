import java.util.Array;
public class ex_42{
   
    public static void printing(int a[])
    {
         for(int i=0; i<a.length; i++)
         {
            
             System.out.println(a[i]);
         }

    }
   
   
   
   
   
    public static void main(String[] lol)
    {
         int a[]= new int[10];
         int b[]=Array.clone(a,10);
              printing(a);

              printing(b);
    }
     
}