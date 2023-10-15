import java.util.Scanner;

public class ex_48{
     public static void main(String[] lol)
     {
        Scanner takker= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENTS YOU WANT");
        int n=takker.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=takker.nextInt();
        }
        System.out.println("ENTER THE NUMBER ");
        int m=takker.nextInt();
        int count=0;
        int last=0;
        
        
        
        
        
        for(int i=0;i<n;i++)
        {
            if(a[i]==m)
            {   
                count++;
                last=i;
            }
            
        
        
        
        
        }
         System.out.println("THE FOLLOWING NUMBER HAS IS "+count+" TIMES IN THE A ARRAY");
        System.out.println("INDEX IS "+last);
        takker.close();
     }
}