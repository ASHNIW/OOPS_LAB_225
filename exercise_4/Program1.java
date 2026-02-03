import java.util.Scanner;
public class Program1{
    public static void main(String[] args){
        double num1,num2,result;
        char op;
        Scanner scanner=new Scanner(System.in);
        Calculator obj=new Calculator();
        System.out.print("Enter the number (num1): ");
        num1=scanner.nextDouble();
        System.out.print("Enter the number (num2): ");
        num2=scanner.nextDouble();
        System.out.print("Enter the operation (+,-,*,/,%): ");
        op=scanner.next().charAt(0);
        result=obj.calc(num1, num2, op);
        System.out.println("the result is : "+num1+op+num2+"="+result);
        
    }
}
class Calculator{
    public double calc(double a,double b,char operator){
        switch (operator) {
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return a/b;
            case '%':
                return a%b;  
            default:
                System.out.println("the operator is not valid.");
                return 0;
        }
    }
}