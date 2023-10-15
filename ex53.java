import java.util.Scanner;
public class ex53 {      //find the total number of pair whose sum is equal to a number in an array
    public static void main(String[] lol)
    {    
        Scanner getter= new Scanner(System.in);
               System.out.println("ENTER THE SIZE OF ARRAY"); 
        int n=getter.nextInt();
        int a[]= new int[n];
        for(int i=0;i<n;i++)
        {
             a[i]=getter.nextInt();
        }
        int pair=0;
        for(int i=0;i<n;i++)
        {
             for(int j=i+1;j<n;j++)
             {
                 if ((a[i]+a[j]==7)&&(a[j]+a[i]==7))
                 {
                     pair++;
                 }
             }
        }   
         System.out.println("TOTAL NUMBER OF PAIR ARE "+pair);
     getter.close();
    
    
    
    
    
    }



}
