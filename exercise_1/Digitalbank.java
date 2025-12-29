public class Digitalbank
{
public static void main(String[] args)
{
String custname="Ash";
byte age=25;
short branchcode=5426;
long accno=165415616841456464L;
double balance=154813.1251;
char acctype='S';
float interestrate=1.5f;
boolean owe=false;
double balanceafterinterest=balance+(balance*(interestrate/100));
System.out.println("Customer name: " + custname);
System.out.println("Branch number: " + branchcode);
System.out.println("Account number: " + accno);
System.out.println("New balance after interest: " + balanceafterinterest);
System.out.println("Account Type: " + acctype);
}
}
