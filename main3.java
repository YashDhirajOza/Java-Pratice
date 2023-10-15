class student
{
     int enrl;
     String name;
     void setname(int rno,String name)
     {
         enrl=rno;
         //name=name;
         this.name=name;

     }
    void show()
    {
         System.out.println("ENROLLMENT NUMBER:"+enrl);
         System.out.println("Name: "+name);

    }
}
 class science extends student{
     int phy,che,maths;
     void setdata(int no,String name,int a,int b,int c)
     {
         super.setname(no,name);
         phy2=a;
         chem=b;
         maths=c;
        }
 }
 public class main3{
     public static void main(String[]  lol)
     {
         science t= new science();
         t.setdata(1,"einstein",100,70,90);
         t.show();
     }
 }