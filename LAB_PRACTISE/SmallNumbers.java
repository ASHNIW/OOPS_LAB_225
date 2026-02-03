import java.util.Scanner;
public class SmallNumbers {
    public static void main(String[] args){
        double num1,num2;
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the number1: ");
        num1=scanner.nextDouble();
        System.out.print("enter the number2: ");
        num2=scanner.nextDouble();
        if (num2<num1){
            System.out.println("THE SMALLEST NUMBER IS : "+num2);
        }
        else{
            System.out.println("THE SMALLEST NUMBER IS : "+num1);
        }
        scanner.close();
    }
}
