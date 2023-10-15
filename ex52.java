import java.util.Scanner;
public class ex52 {
    public static void main(String[] lol)
    {
        Scanner getter= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENTS YOU WANT");
        int n=getter.nextInt();

        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
             a[i]=getter.nextInt();
        }
       int j=n-1;
        for(int i=0;i<n;i++)
        {
             if(a[i]>a[j])
             {
                 System.out.println("THE GIVEN ARRAY IS SORTED");
             
                }
             else{
                  System.out.println("THE GIVEN ARRAY IS NOT SORTED");
             }
        
             j--;
            }
         
       
        getter.close();
    
        }

    
}
