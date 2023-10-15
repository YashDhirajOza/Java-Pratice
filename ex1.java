class area1(int a)
{
     return a*a;
}
int area1(int a,int b)
{
     return a*b;
}
class volume extends area1{
     int volume1(int a,int b){
         int area=area1(a)*b;
         return area;
     }
int volume(int a,int b,int c)
{
     int area=area1(a,b)*c;
     return area;
}
}
public class ex1{
     public static void main(String[] LOL)
     {
         volume ob1=new volume();
         System.out.println(ob1.volume1(4,10));
         System.out.println(ob1.volume(4,5,6));
     }
}