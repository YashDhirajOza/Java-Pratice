import java.util.Scanner;
public class Main1{
    public static void main(String[] LOL)
    {
         Scanner sc = new Scanner(System.in);
         int a= sc.nextInt();
         if(a>=1  &&  a<=10){
             System.out.println("lies between 1 to 10");

         }
         else if(a<=11 && a>=20)
         {
             System.out.println("THE GIVEN NUMBER LIES BETWEEN 11 to 20");
         }

        else if (a>0)
         {
             System.out.println("THE GIVEN NUMBER IS POISITIVE");
         }
         else if (a<0){
             System.out.println("THE GIVEN NUMBER IS NEGATIVE");
         }
         


    
        }
}