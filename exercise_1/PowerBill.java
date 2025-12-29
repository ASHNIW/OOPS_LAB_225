public class PowerBill
{
public static void main(String[] args)
{
String appliancename="AC";
float powerrating=2.5f;
int hoursusedperday=8;
int daysinmonth=30;
double costperkwh=0.15;
boolean isecofriendly=true;
char energyrating='A';
double totalkwh=powerrating*hoursusedperday*daysinmonth;
double totalcost=totalkwh*costperkwh;
System.out.println("Application Name: "+appliancename);
System.out.println("energy rating: "+energyrating);
System.out.println("is eco-friendly: " + isecofriendly);
System.out.println("Total kwh used: " + totalkwh);
System.out.println("Total Cost: " + totalcost);
}
}

