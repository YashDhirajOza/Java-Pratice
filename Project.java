import java.util.Scanner;
public class Project{
public static void main(String[] arg){
    Scanner input = new Scanner(System.in);
    /////input////
    double[] unitsCost= new double[4];
    System.out.println("Enter of electricity in units \nIn time 6:00 am to 12:00 pm (morning)\n In time 12:00 pm to 6:00 pm (afternoon) \nIn time 6:00 pm to 12:00 am (evening)/nIn time 12:00 am to 6:00 am (night)");
    
    for(int i=0;i<4;i++)
    {
        unitsCost[i]=input.nextDouble();
    }

    System.out.println("/nWe have 6 appliance at home \n1)TV (Average 100 watts) \n2)Refrigerator (Average 400 watts)\n3)Washing machine  (Average 1000 watts)\\n" + //
            "4)fan (3 fans) (Average 60 Watts)\n" + //
                    "5)Tube light (3)(Average 15 Watts)\n" + //
                            "6)Phone charging(3) (average 8 Watts)\n" + //
                                    ""  //
            );
    
//power/////


System.out.println("Enter power rating of TV\n");               //Power of TV
    Double powerTV = input.nextDouble();                        //Poewr of WS
System.out.println("Enter power rating of Fridge\n");       // Power of fridge
    Double powerFridge = input.nextDouble();
System.out.println("Enter power rating of Washing machine\n");  
    Double powerWashing = input.nextDouble();
System.out.println("Enter power rating of Fan\n");              // Powerliving room fan
    Double powerFan = input.nextDouble();
System.out.println("Enter power rating of  light\n");           //Power Other light
    Double powerLight= input.nextDouble();
System.out.println("Enter power rating of Charger\n");          //Power charger
    Double powercharger = input.nextDouble();

///time //

System.out.println("Enter time of usage of TV (in hours)\n");                   //Time tv
    int timeTV = input.nextInt();
System.out.println("Enter time of usage of Fridge (in hours)\n");                   //time fridge
    int timeFridge= input.nextInt();
System.out.println("Enter time of usage of Washing machine (in hours)\n");          //time washing
    int timeWashing = input.nextInt();
System.out.println("Enter time of usage of Living room Fan (in hours)\n");          //Living room fan1
    int timeFan1= input.nextInt();
System.out.println("Enter time of usage of Bedroom Fan(in hours)\n");               //Bedroom fan2
    int timeFan2 = input.nextInt();
System.out.println("Enter time of usage of Other Fan (in hours)\n");                //Other fan3
    int timeFan3 = input.nextInt();
System.out.println("Enter time of usage of bedroom light (in hours)\n");            //Bedroom light2
    int timeLight2 = input.nextInt();
System.out.println("Enter time of usage of Living room Light (in hours)");          //Living room Light1
    int timeLight1 = input.nextInt();
System.out.println("Enter time of usage of Other Light (in hours)");                //Other light3
    int timeLight3 = input.nextInt();
System.out.println("Enter time of usage of Charger (in hours)");                    //charger
    int timeCharger= input.nextInt();


    //Unit cost of electricity//
double usageTV= powerTV*timeTV/(1000);         //Tv
double usageFridge= powerFridge*timeFridge/(1000); //fridge
double usageWashing= powerWashing*timeWashing/(1000);//washing machine
double usageFan1= powerFan*timeFan1/(1000);    //living room fan
double usageFan2= powerFan*timeFan2/(1000);    //bedroom fan

double usageFan3= powerFan*timeFan3/(1000);    //other fan
double usageLight1= powerLight*timeLight1/(1000);  //living room light
double usageLight2= powerTV*timeLight2/(1000); //living room light
double usageLight3= powerTV*timeLight3/(1000); //other light
double usageCharger = powercharger*timeCharger/(1000); //charger



//////////////////////////////////////////////////////////////////////////cost of TV
double costTV=1000,TV;
for(int i=0;i<4;i++)
{
if(i==3){
}
else{
    TV=unitsCost[i]*usageTV;
costTV=Math.min(TV,costTV );

}
}
System.out.println("Minimum cost of TV "+ costTV);
//////////////////////////////////////////////////////////////////////////cost of fridge
double costFridge=10000,Fridge=0;
for(int i=0;i<4;i++)
{
Fridge=unitsCost[i]*usageFridge;
costFridge=Math.min(Fridge,costFridge );
}
System.out.println("Minimum cost of Fridge "+ costFridge);
/////////////////////////////////////////////////////////////////////////////////cost of washing
double costWashing=unitsCost[0]*usageWashing;
System.out.println("Minimum cost Washing "+ costWashing);
////////////////////////////////////////////////////////////////////////////////living room fan1
double costFan1=10000,Fan1=0;
for(int i=0;i<4;i++)
{
Fan1=unitsCost[i]*usageFan1;
costFan1=Math.min(Fan1,costFan1 );
}
System.out.println("Minimum cost Living room fan "+ costFan1);
/////////////////////////////////////////////////////////////////////////////////bedroom fan2
double costFan2=10000,Fan2=0;
for(int i=0;i<4;i++)
{
Fan2=unitsCost[i]*usageFan2;
costFan2=Math.min(Fan2,costFan2 );
}
System.out.println("Minimum cost Bedroom fan "+ costFan2);
///////////////////////////////////////////////////////////////////////////////////other fan3
double costFan3=10000,Fan3=0;
for(int i=0;i<4;i++)
{
Fan3=unitsCost[i]*usageFan3;
costFan3=Math.min(Fan3,costFan3 );
}
System.out.println("Minimum cost other fan "+ costFan3);
///////////////////////////////////////////////////////////////////////////////////////////Bed room room light2
double costLight2=unitsCost[2]*usageLight2;
System.out.println("Minimum cost bedroom room light "+costLight2 );
//////////////////////////////////////////////////////////////////////////////////////////////living room light1
double costLight1=unitsCost[2]*usageLight1;
System.out.println("Minimum cost living room  light "+costLight1);
////////////////////////////////////////////////////////////////////////////////////////////////////other light3
double costLight3=10000,Light3=0;
for(int i=2;i<4;i++)
{
Light3=unitsCost[i]*usageLight3;
costLight3=Math.min(Light3,costLight3 );
}
System.out.println("Minimum cost other light "+ costLight3);
///////////////////////////////////////////////////////////////////////////////////////////////////////////charger
double costCharger=10000,Charger=0;
for(int i=0;i<4;i++)
{
Charger=unitsCost[i]*usageCharger;
costCharger=Math.min(Charger,costCharger );
}
System.out.println("Minimum cost charger "+ costCharger);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
double dayUsage = costCharger+costFan1+costFan2+costFan3+costFridge+costLight1+costLight2+costLight3+costTV+costWashing;
System.out.println("Cost of electricity per day " + dayUsage);
System.out.println("Cost of electricity per week " + dayUsage*7); 
System.out.println("Cost of electricity per month " + dayUsage*30);

input.close();
}
}
