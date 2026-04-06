import java.util.Scanner;
class Room{
    double rate;
    void getRate(double r){
        rate=r;
    }
    void displayRate(){
        System.out.println("The rate is : "+rate);
    }
}
class deluxeRoom extends Room{
    double rate;
    deluxeRoom(double rate){
        this.rate=rate;
    }
    void addRate(){
        rate+=500;
        super.rate=rate;
        super.displayRate();
    }
}
class normalRoom extends Room{
    normalRoom(double r){
        super.rate=r;
        super.displayRate();
    }
}
public class Hotel {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        double rate;
        int opt;
        System.out.println("Enter the rate of the room : ");
        rate=obj.nextDouble();
        System.out.println("enter your choice: 1.normal room 2. deluxe room");
        opt=obj.nextInt();
        if (opt==1){
            normalRoom room1=new normalRoom(rate);
        }
        else if(opt==2){
            deluxeRoom room2=new deluxeRoom(rate);
            room2.addRate();
        }
        obj.close();
    }
}