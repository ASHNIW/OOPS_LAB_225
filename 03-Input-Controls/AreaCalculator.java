import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose shape: 1. Circle 2. Rectangle");
        int choice = sc.nextInt();
        
        if (choice == 1) {
            System.out.print("Enter radius: ");
            double radius = sc.nextDouble();
            double area = Math.PI * radius * radius;
            System.out.println("Area of Circle: " + area);
        } else if (choice == 2) {
            System.out.print("Enter length: ");
            double length = sc.nextDouble();
            System.out.print("Enter breadth: ");
            double breadth = sc.nextDouble();
            double area = length * breadth;
            System.out.println("Area of Rectangle: " + area);
        }
        sc.close();
    }
}
