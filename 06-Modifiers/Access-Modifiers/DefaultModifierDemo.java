class DefaultAccess {
    String message = "This is default access modifier";
    
    void display() {
        System.out.println(message);
    }
}

public class DefaultModifierDemo {
    public static void main(String[] args) {
        DefaultAccess obj = new DefaultAccess();
        obj.display();
    }
}
