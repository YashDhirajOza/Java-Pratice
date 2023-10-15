
public class P_4{
    public static int Gandu(int [] b)
    {    int sum=0;
         for(int i=0;i<b.length;i++)
         {
           sum=sum+b[i];
             
         
         
          }  
          return sum;
        }
     public static int pandu (int [] x)
     {
       int max=0;
       for(int i=0;i<x.length;i++)
       {
         if(x[i]>max)
         {
           max=x[i];

         }
         }
         return max;
     }
    
    
    
    public static void main(String[] lol)
     { 
         int a[]={1,5,3};

         int answer=Gandu(a);
         int m=pandu(a); 
         System.out.println(answer);
         System.out.println(m);

        }
    }                                                                    
                                                                    