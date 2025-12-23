public class FindAvg
{
public int findavg(int numA,int numB,int numC)
{
return (numA+numB+numC)/3;
}
public static void main(String args[])
{
FindAvg obj=new FindAvg();
int avg=obj.findavg(10,20,30);
System.out.println("Average of 10,20 and 30 is :"+avg);
}
}

