public class TernaryOperator {
    public static void main(String[] args) {
        int a = 20;
        int b = 15;
        
        int result = (a > b) ? a : b;
        System.out.println("The larger number is: " + result);
        
        String status = (a % 2 == 0) ? "Even" : "Odd";
        System.out.println(a + " is " + status);
    }
}
