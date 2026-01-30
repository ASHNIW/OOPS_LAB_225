import java.util.Scanner;
public class Fibonocci {
    public static void main(String[] args) {
        int number,a=0,b=1,next;
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter the number of terms: ");
        number=scanner.nextInt();
        for (int i=1;i<=number;i++){
            System.out.print(a+" ");
            next=a+b;
            a=b;
            b=next;
        scanner.close();
        }
    }
}
