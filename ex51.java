import java.util.Scanner;
public class ex51 {
    
        
     
  
    
    
    
  
    
    
    public static void main(String[] lol)
    {     Scanner getter= new Scanner(System.in);
         System.out.println("ENTER THE NUMBER ELEMENTS IN ARRAY");
         int n=getter.nextInt();
        int a[]= new int[n];
       for(int i=0;i<n;i++)
       {
         a[i]=getter.nextInt();
       }
       System.out.println("ENTER THE NUMBER");
       int m=getter.nextInt();
       int index=0,count=0;
            
       for(int i=0;i<n;i++)
       {
         if(a[i]>m)
         {   count++;
             index=i;
         }
       }

    
    
        getter.close();
       System.out.println(count);
        System.out.println("THE INDEX IS "+index);    
    }
    
}
