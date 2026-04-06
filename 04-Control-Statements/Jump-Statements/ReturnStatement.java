public class ReturnStatement {
    public static void main(String[] args) {
        System.out.println("Calling calculateSquare(4): " + calculateSquare(4));
        System.out.println("Calling calculateSquare(7): " + calculateSquare(7));
    }
    
    public static int calculateSquare(int num) {
        return num * num;
    }
}
