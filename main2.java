class B1{
     int i,j,k,ans;
     void sum(int a,int b,int c)
     {
         i=a;j=b;k=c;
         ans=i+j+k;
     }
}
class B2 extends B1{
     int avg;
     void avg(int a,int b, int c)
     {
         sum(a,b,c);
         avg=ans/3;
         System.out.println("THE AVERAGE of "+a+","+b+","+c+" is "+avg);

     }
}
public class main2{
public static void main(String[] LOl)
{
     B2 ob1= new B2();
     ob1.avg(10,20,30);
}
}