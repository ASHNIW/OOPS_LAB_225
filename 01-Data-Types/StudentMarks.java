import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name = "John";
        int age = 20;
        double height = 5.9;
        char grade = 'A';
        boolean isPassed = true;
        
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
        System.out.println("Passed: " + isPassed);
        
        input.close();
    }
}
