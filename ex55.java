import java.util.Scanner;

public class ex55 {  //find the second largest number in an given array
    public static void main(String[] lol)
    {
        
                  Scanner getter= new Scanner(System.in);
               System.out.println("ENTER THE SIZE OF ARRAY"); //point to be noted that if array elemts are equal then this will not work 
                 int n=getter.nextInt();
                 int a[]= new int[n];
                for(int i=0;i<n;i++)
                    {
                        a[i]=getter.nextInt();
                    }
                int max=Integer.MIN_VALUE;
                for(int i=0;i<n;i++)   //for finding the max valve in the array
                {
                     if(a[i]>max)
                     {
                         max=a[i];
                     }
                }    
                int smax=0;
                for(int j=0;j<n;j++)     //for finding the second max in the array 
                {
                     if ((a[j]>smax)&&(a[j]<max))
                     {
                         smax=a[j];
                     }
                }
                System.out.println("THE LARGEST NUMBER IS GIVEN ARRAY IS "+max);
                System.out.println("THE SECOND LARGEST NUMBER IS THE GIVEN ARRAY IS "+smax);
    
    
    
    
    
         getter.close();
    }
    
}
