import java.util.Scanner;

public class ShoppingBillSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Shopping Bill Generator ===");
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();
        
        double total = 0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter price of item " + i + ": ");
            double price = sc.nextDouble();
            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            total += price * qty;
        }
        
        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();
        
        double discountAmount = total * discount / 100;
        double finalAmount = total - discountAmount;
        
        System.out.println("\n--- Bill Summary ---");
        System.out.println("Total Amount: Rs. " + total);
        System.out.println("Discount: Rs. " + discountAmount);
        System.out.println("Final Payable: Rs. " + finalAmount);
        
        sc.close();
    }
}
