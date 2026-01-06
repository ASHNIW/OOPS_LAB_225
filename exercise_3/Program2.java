import java.util.Scanner;
public class Program2
{
    public static void main(String[] args)
    {
        int lucky_num=4;
        Scanner obj=new Scanner(System.in);
        int guess_num;
        do{
            System.out.println("guess the number between 1 to 10: ");
            guess_num=obj.nextInt();
            if (guess_num!=lucky_num){
                System.out.println("the guessed number is incorrect.");
            }
        } while (guess_num!=lucky_num);
        System.out.println("you have guessed the number correctly.");
        obj.close();

    }
}