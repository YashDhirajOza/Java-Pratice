public class ex_3
{
    public static void main(String[] lol)
    {   int space=6,star=1;
       for(int i=1;i<=6;i++)
       {
         for(int k=1;k<=space;k++)
         {
           System.out.print(" ");

         }
         for(int j=1;j<=star;j++)
         {
           System.out.print(i);
         } 
       
       star+=2;
       space--;
       System.out.print("\n");
       
        }
    }
}