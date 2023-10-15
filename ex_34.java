public class ex_34{
    public static void main(String[] lol)
    {
         int a =45;
         int b=0;
         try
         {
             div(a,b);
         }
         catch (ArithmeticException w)
         {
             System.out.println("OKAY");

         }
    }
   static void div(int x,int y) throws ArithmeticException
   {
    int c=x/y;
    System.out.println("Div: "+c);
   }
}
   









