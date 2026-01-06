import java.util.Scanner;
public class Program3
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int number,sum=0,i;
        System.out.println("enter the number for the sum of n numbers : ");
        number=obj.nextInt();
        for (i=0;i<=number;i++)
        {
            sum+=i;
        }
        System.out.println("the sum of "+number+" is :"+sum);
        obj.close();
    }
}