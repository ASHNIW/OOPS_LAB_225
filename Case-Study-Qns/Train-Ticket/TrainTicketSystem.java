import java.util.Scanner;

public class TrainTicketSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Train Ticket Booking ===");
        System.out.print("Enter passenger name: ");
        String name = sc.nextLine();
        
        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();
        
        double ratePerKm = 2.5;
        double baseFare = 50;
        double totalFare = baseFare + (distance * ratePerKm);
        
        System.out.print("Enter passenger age: ");
        int age = sc.nextInt();
        
        if (age > 60) {
            totalFare = totalFare * 0.8;
            System.out.println("Senior citizen discount applied!");
        }
        
        System.out.println("\n--- Ticket Details ---");
        System.out.println("Passenger: " + name);
        System.out.println("Distance: " + distance + " km");
        System.out.println("Total Fare: Rs. " + totalFare);
        
        sc.close();
    }
}
