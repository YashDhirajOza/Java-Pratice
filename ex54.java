import java.util.Scanner;

public class ex54 {   //find the unique number in a given array where all the lements are begin repeated twice
                       // with one valve being unique
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
                   
                    for(int i=0;i<n;i++)
                    {
                        for(int j=i+1;j<n;j++)
                    {
                            if (a[i]==a[j])
                        {
                            a[i]=-1;
                            a[j]=-1;
                         }
                     }
                    }   
                    int number=0;
                    for(int i=0;i<n;i++)
                    {
                        for(int j=i+1;j<n;j++)
                    {    if(a[i]>0)
                           {number=a[i];}
                    }
                    }
                    System.out.println("THE ONE IS "+number);
               
                    
                    
                    
                    getter.close();
                }
}
