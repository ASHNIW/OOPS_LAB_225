import java.util.Scanner;
public class Program1 {
    public static void main(String[] args)
    {
        boolean value=true;
        char grade='F';
        Scanner obj=new Scanner(System.in);
        double total,average,math, science, english, social, compsci;
        while (value) 
        {
        System.out.println("enter your math marks: ");
        math=obj.nextDouble();
        System.out.println("enter your science marks: ");
        science=obj.nextDouble();
        System.out.println("enter your english marks: ");
        english=obj.nextDouble();
        System.out.println("enter your social marks: ");
        social=obj.nextDouble();
        System.out.println("enter your computer science marks: ");
        compsci=obj.nextDouble();
        total=(math+science+english+social+compsci);
        average=total/5;
        if (average>=90)
        {
            grade='A';
            System.out.println("total: "+total+" average: "+average);
        }
        else if (average>=80) 
        {
            grade='B';
            System.out.println("total: "+total+" average: "+average);
        }
        else if (average>=70) 
        {
            grade='C';
            System.out.println("total: "+total+" average: "+average);   
        }
        else if (average>=60) 
        {
            grade='D';
            System.out.println("total: "+total+" average: "+average);
        }
        else
        {
            grade='E';
            System.out.println("total: "+total+" average: "+average);   
        }
        switch (grade) {
            case 'A':
                System.out.println("extraordinary score");
                break;
            case 'B':
                System.out.println("nice score");
                break;
            case 'C':
                System.out.println("good score");
                break;
            case 'D':
                System.out.println("normal score");
                break;
            case 'E':
                System.out.println("below average");
                break;
            case 'F':
                System.out.println("Fail");
            default:
                break;
        }
        System.out.println("do u want to analyse any more students: (true/false)");
        value=obj.nextBoolean();
        }
        obj.close();
        System.out.println("program terminated.");
    }
}