import java.util.Scanner;

public class ex56 {
    // Question=Given an array 'a' constiting of integers
    //return the first valve that is repeating in this array
    //if no valve is beign repeated return -1;

    public static void main(String[] lol)
    {     Scanner getter= new Scanner(System.in);
               System.out.println("ENTER THE SIZE OF ARRAY"); 
                 int n=getter.nextInt();
                 int a[]= new int[n];
                for(int i=0;i<n;i++)
                    {
                        a[i]=getter.nextInt();
                    }
      
                     for(int i = 0; i < n; i++) {
                           for(int j = i + 1; j < n; j++) {
                                if(a[i] == a[j]) {
                                    System.out.println("THE REQUIRED NUMBER IS " + a[i]);
                                        getter.close();
                                            return; 
                                                }
                                                             }
                                                }

System.out.println("No repeating element found."); 
getter.close();
    }
    
}
